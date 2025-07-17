package com.emp.OnetoOne.service;

import com.emp.OnetoOne.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    List<StudentDto> getAllStudent();
}
