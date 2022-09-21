package com.geonhee.openfeigndemo.openfeign.client;

import com.geonhee.openfeigndemo.user.model.UserRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * name: 서비스 ID, spring-cloud 의 eureka 에 사용
 * url: 실제 호출할 서비스의 URL
 */
@FeignClient(name = "user-api", url = "http://localhost:8080/users")
public interface UserClient {

  @GetMapping("/status")
  String findStatus();

  @PostMapping("/join-user")
  String joinUser(UserRequestDto userRequestDto);
}
