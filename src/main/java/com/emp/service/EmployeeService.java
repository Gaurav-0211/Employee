package com.emp.service;

import com.emp.dto.EmployeeDto;
import com.emp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
    Optional<EmployeeDto> getEmployeeById(long id);
}
