package com.emp.controller;

import com.emp.dto.ProjectDto;
import com.emp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectDto> createProject(@Validated @RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(projectService.createProject(projectDto));
    }


    @GetMapping
    public List<ProjectDto> getAll(){
        return projectService.getAllProjects();
    }

}
