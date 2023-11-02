package com.example.springstudentdatajpa.controller;

import com.example.springstudentdatajpa.domain.Student;
import com.example.springstudentdatajpa.service.ScoreService;
import com.example.springstudentdatajpa.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
  private final StudentService studentService;
  private final ScoreService scoreService;

  @GetMapping
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }

  @GetMapping("/studentInfo/{id}")
  public Student getAllStudents(@PathVariable int id) {
  return studentService.getStudentInfo(id);
  }

}
