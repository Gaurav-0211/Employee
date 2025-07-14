package com.emp.controller;

import com.emp.dto.ProjectDto;
import com.emp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @PostMapping
    public ProjectDto createProject(ProjectDto projectDto){
        return projectService.createProject(projectDto);
    }

    @GetMapping
    public List<ProjectDto> getAll(){
        return projectService.getAllProjects();
    }

}
