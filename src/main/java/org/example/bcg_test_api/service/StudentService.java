package org.example.bcg_test_api.service;

import org.example.bcg_test_api.dto.StudentDto;
import org.example.bcg_test_api.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService{
    List<StudentEntity> getStudents();
    List<StudentEntity> populateStudents();
}