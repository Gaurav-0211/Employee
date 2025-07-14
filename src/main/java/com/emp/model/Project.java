package com.emp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String projectName;

    private String duration;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
