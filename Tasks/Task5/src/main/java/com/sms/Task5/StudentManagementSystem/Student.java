package com.sms.Task5.StudentManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Student class to store the student details
// here we  used some spring boot annotations that helps us to accomplish our goal easily
// this is a hibernate orm annotation 
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private long rollNumber;
    private String name;
    private String fatherName;
    private String grade;
    private String cource;   
}
