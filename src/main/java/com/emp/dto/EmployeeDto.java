package com.emp.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class EmployeeDto {
    private long id;
    private String empName;
    private String pos;
    private long projectId;
}
