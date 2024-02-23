package com.sms.Task5.StudentManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



// interface that extends JpaRepositary interface that a standard interface for performing operation on a database
@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
  
    
}
