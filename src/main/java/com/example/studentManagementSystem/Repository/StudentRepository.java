package com.example.studentManagementSystem.Repository;

import com.example.studentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {


}
