package org.example.bcg_test_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.bcg_test_api.dto.StudentDto;
import org.example.bcg_test_api.entity.StudentEntity;
import org.example.bcg_test_api.repository.StudentRepository;
import org.example.bcg_test_api.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<StudentEntity> getStudents() {
        List<StudentEntity> students = (List<StudentEntity>) studentRepository.findAll();
        return students;
    }

    @Override
    public List<StudentEntity> populateStudents() {
        List<StudentEntity> studentEntities = new ArrayList<>();
        String[] firstNames = {"omar","samira","issam","salwa","samir","karim"};
        String[] lastNames = {"khamri", "lamin", "simo", "hafid", "aidi", "kilan"};
        String[] subjects = {"maths", "physics", "science", "philo", "biology"};
        for(int i=0; i<100 ; i++){
            StudentEntity studentEntity = StudentEntity.builder()
                    .id((long)i)
                    .firstName(firstNames[(int)(Math.random()*firstNames.length)])
                    .lastName(lastNames[(int)(Math.random()*lastNames.length)])
                    .gpa((float) (Math.random()*4))
                    .minor(subjects[(int)(Math.random()*subjects.length)])
                    .major(subjects[(int)(Math.random()*subjects.length)])
                    .build();
            studentEntities.add(
                    studentEntity
            );
        }
        studentRepository.saveAll(studentEntities);
        return studentEntities;
    }
}
