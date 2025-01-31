package org.example.bcg_test_api.mapper;

import lombok.RequiredArgsConstructor;
import org.example.bcg_test_api.dto.StudentDto;
import org.example.bcg_test_api.entity.StudentEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentMapper {

    private final ModelMapper modelMapper;
    public StudentEntity mapFrom(StudentDto studentDto){
        return modelMapper.map(studentDto,StudentEntity.class);
    }
    public StudentDto mapTo(StudentEntity studentEntity){
        return modelMapper.map(studentEntity, StudentDto.class);
    }


}
