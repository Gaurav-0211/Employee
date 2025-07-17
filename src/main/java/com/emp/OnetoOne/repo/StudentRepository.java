package com.emp.OnetoOne.repo;

import com.emp.OnetoOne.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
