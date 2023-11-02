package com.example.springstudentdatajpa.repository;

import com.example.springstudentdatajpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
