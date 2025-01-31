package org.example.bcg_test_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "sutudent")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String major;
    private String minor;
    private Float gpa;

    public String toString(){
        return "first name : "+firstName+" last name : "+lastName;
    }
}
