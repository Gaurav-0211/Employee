package com.emp.controller;

import com.emp.dto.EmployeeDto;
import com.emp.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        return employeeService.createEmployee(employeeDto);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

}
