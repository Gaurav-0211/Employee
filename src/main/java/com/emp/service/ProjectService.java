package com.emp.service;

import com.emp.dto.ProjectDto;


import java.util.List;
public interface ProjectService {
    ProjectDto createProject(ProjectDto projectDto);
    List<ProjectDto> getAllProjects();
}
