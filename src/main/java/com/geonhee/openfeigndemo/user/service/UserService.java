package com.geonhee.openfeigndemo.user.service;

import com.geonhee.openfeigndemo.user.model.UserRequestDto;
import com.geonhee.openfeigndemo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

  private final UserRepository userRepository;

  public void joinUser(UserRequestDto userRequestDto) {
    userRepository.save(userRequestDto.toEntity());
  }
}
