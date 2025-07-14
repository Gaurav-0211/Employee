package com.emp.service.impl;

import com.emp.dto.EmployeeDto;
import com.emp.dto.ProjectDto;
import com.emp.model.Employee;
import com.emp.model.Project;
import com.emp.repo.EmployeeRepository;
import com.emp.repo.ProjectRepository;
import com.emp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    ModelMapper mapper;
    ProjectRepository projectRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setEmpName(dto.getEmpName());
        employee.setPos(dto.getPos());

        Project project = projectRepository.findById(dto.getProjectId())
                .orElseThrow(() -> new RuntimeException("Project not found with id " + dto.getProjectId()));
        employee.setProject(project);

        Employee saved = employeeRepository.save(employee);
        return mapper.map(saved, EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(emp -> {
                    EmployeeDto dto = mapper.map(emp, EmployeeDto.class);
                    dto.setProjectId(emp.getProject().getId());
                    return dto;
                }).collect(Collectors.toList());
    }

}
