package com.emp.service.impl;

import com.emp.dto.ProjectDto;
import com.emp.model.Project;
import com.emp.repo.ProjectRepository;
import com.emp.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
 @RequiredArgsConstructor
 public class ProjectServiceImpl implements ProjectService {

     private final ProjectRepository projectRepo;
     private final ModelMapper mapper;

     @Override
     public ProjectDto createProject(ProjectDto dto) {
         Project project = new Project();
         project.setProjectName(dto.getProjectName());
         project.setDuration(dto.getDuration());

         Project saved = projectRepo.save(project);

         ProjectDto result = new ProjectDto();
         result.setProjectName(saved.getProjectName());
         result.setDuration(saved.getDuration());
         return result;
        }

        @Override
        public List<ProjectDto> getAllProjects() {
            return projectRepo.findAll().stream()
                    .map(p -> mapper.map(p, ProjectDto.class))
                    .collect(Collectors.toList());
        }
}
