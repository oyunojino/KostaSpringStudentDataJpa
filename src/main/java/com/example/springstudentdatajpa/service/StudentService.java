package com.example.springstudentdatajpa.service;

import com.example.springstudentdatajpa.domain.Score;
import com.example.springstudentdatajpa.domain.Student;
import com.example.springstudentdatajpa.domain.StudentPointDto;
import com.example.springstudentdatajpa.repository.ScoreRepository;
import com.example.springstudentdatajpa.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository;
  private final ScoreRepository scoreRepository;

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public Student getStudentInfo(int id) {
    return studentRepository.findById(id).get();
  }

  public void updateStudent(int id) {
    Student findStudent = studentRepository.findById(id).get();
    Score findScore = scoreRepository.findById(id).get();
    float resScore = (findStudent.getPoint() + findScore.getSPoint()) / 2.0f;
    findStudent.setPoint(resScore);
    studentRepository.save(findStudent);
  }

//  public int addNewStudent(Student student) {
//    int id = studentRepository.addStudent(student);
//    System.out.println(id);
//    return id;   // 확인!!
//  }

//  public List<Student> getStudentInquiry(StudentPointDto studentPointDto) {
//    List<Student> students = studentRepository.findByInquiryDto(studentPointDto);
//    return students;
//  }
}
