package com.emp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String empName;

    private String pos;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonIgnore // Prevent from Infinite loop
    private Project project;
}
