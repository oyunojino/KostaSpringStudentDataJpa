package com.example.springstudentdatajpa.service;

import com.example.springstudentdatajpa.domain.Score;
import com.example.springstudentdatajpa.repository.ScoreRepository;
import com.example.springstudentdatajpa.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class ScoreService {
  private final StudentRepository studentRepository;
  private final ScoreRepository scoreRepository;

  public Score getStudentScore(int id){
    return scoreRepository.findById(id).get();
  }

//  public int addStudentScore(Score score){
//    return scoreRepository.addScore(score);
//  }
}
