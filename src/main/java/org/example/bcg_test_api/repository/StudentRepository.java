package org.example.bcg_test_api.repository;

import org.example.bcg_test_api.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

}
