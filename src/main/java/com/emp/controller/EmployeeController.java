package com.emp.controller;

import com.emp.dto.EmployeeDto;
import com.emp.dto.ProjectDto;
import com.emp.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createProject(@Validated @RequestBody EmployeeDto dto) {
        return ResponseEntity.ok(employeeService.createEmployee(dto));
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

}
