package com.geonhee.openfeigndemo.openfeign.service;

import com.geonhee.openfeigndemo.openfeign.client.UserClient;
import com.geonhee.openfeigndemo.user.model.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OpenFeignService {

  private final UserClient userClient;

  /**
   * 유저들의 상태 조회
   *
   * @return 상태 텍스트
   */
  public String findStatus() {
    return userClient.findStatus();
  }

  /**
   * 유저 회원가입
   *
   * @param userRequestDto 회원가입 할 유저 정보
   * @return 회원가입 성공 텍스트
   */
  public String joinUser(UserRequestDto userRequestDto) {
    return userClient.joinUser(userRequestDto);
  }
}
