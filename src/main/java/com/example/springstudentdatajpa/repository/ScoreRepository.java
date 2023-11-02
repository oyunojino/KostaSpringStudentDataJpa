package com.example.springstudentdatajpa.repository;

import com.example.springstudentdatajpa.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
