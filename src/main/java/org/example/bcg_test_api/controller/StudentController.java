package org.example.bcg_test_api.controller;


import lombok.RequiredArgsConstructor;
import org.example.bcg_test_api.dto.StudentDto;
import org.example.bcg_test_api.entity.StudentEntity;
import org.example.bcg_test_api.mapper.StudentMapper;
import org.example.bcg_test_api.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final StudentMapper studentMapper;

    @GetMapping("/student")
    public List<StudentDto> getStudents(){
        List<StudentEntity> studentEntities = studentService.getStudents();
        List<StudentDto> studentDtos = new ArrayList<>();
        studentEntities.forEach(studentEntity -> studentDtos.add(studentMapper.mapTo(studentEntity)));
        return studentDtos;
    }

    @PostMapping("/student/populate")
    public List<StudentDto> populateStudents(){
        List<StudentEntity> studentEntities = studentService.populateStudents();
        List<StudentDto> studentDtos = new ArrayList<>();
        studentEntities.forEach(studentEntity -> studentDtos.add(studentMapper.mapTo(studentEntity)));
        return studentDtos;
    }

}
