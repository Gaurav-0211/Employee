package com.emp.service;

import com.emp.dto.EmployeeDto;
import com.emp.model.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
}
