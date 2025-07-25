package com.emp.OnetoOne.controller;

import com.emp.OnetoOne.dto.StudentDto;
import com.emp.OnetoOne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> create(@RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.createStudent(studentDto));
    }

    @GetMapping
    public List<StudentDto> getAll(){
        return studentService.getAllStudent();
    }

}
