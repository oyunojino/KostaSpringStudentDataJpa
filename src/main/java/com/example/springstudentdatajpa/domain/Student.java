package com.example.springstudentdatajpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
public class Student {
  @Id
  private int id;
  private String name;
  private String univ;
  private Date birth;
  private String email;
  private float point;
}
