package com.geonhee.openfeigndemo.user.model;

import com.geonhee.openfeigndemo.user.entity.User;

public record UserRequestDto(String nickname, int age) {

  public User toEntity() {
    return new User(nickname, age);
  }
}
