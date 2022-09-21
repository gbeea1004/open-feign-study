package com.geonhee.openfeigndemo.user.controller;

import com.geonhee.openfeigndemo.user.model.UserRequestDto;
import com.geonhee.openfeigndemo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/** API call 용도 */
@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

  private final UserService userService;

  @GetMapping("/status")
  public String getStatus() {
    return "Status Good!";
  }

  @PostMapping
  public String joinUser(@RequestBody UserRequestDto userRequestDto) {
    userService.joinUser(userRequestDto);
    return "join user";
  }
}
