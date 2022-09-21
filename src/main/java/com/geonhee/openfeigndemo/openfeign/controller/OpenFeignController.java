package com.geonhee.openfeigndemo.openfeign.controller;

import com.geonhee.openfeigndemo.openfeign.service.OpenFeignService;
import com.geonhee.openfeigndemo.user.model.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/open-feign")
@RestController
public class OpenFeignController {

  private final OpenFeignService openFeignService;

  @GetMapping("/users/status")
  public ResponseEntity<String> getStatus() {
    return new ResponseEntity<>(openFeignService.findStatus(), HttpStatus.OK);
  }

  @PostMapping("/users")
  public ResponseEntity<String> joinUser(@RequestBody UserRequestDto userRequestDto) {
    return new ResponseEntity<>(openFeignService.joinUser(userRequestDto), HttpStatus.OK);
  }
}
