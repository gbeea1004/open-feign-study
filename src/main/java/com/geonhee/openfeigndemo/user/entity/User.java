package com.geonhee.openfeigndemo.user.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

  private Long id;
  private String nickname;
  private int age;

  public User(String nickname, int age) {
    this.nickname = nickname;
    this.age = age;
  }
}
