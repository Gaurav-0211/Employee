package com.OnetoOne.service;

import com.OnetoOne.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    List<StudentDto> getAllStudent();
}
