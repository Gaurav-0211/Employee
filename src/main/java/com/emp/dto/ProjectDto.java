package com.emp.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ProjectDto {
    private String projectName;
    private String duration;
    private List<EmployeeDto> employees;
}
