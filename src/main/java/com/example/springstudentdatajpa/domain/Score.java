package com.example.springstudentdatajpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Score {
  @Id
  private int id;
  private float sPoint;
}
