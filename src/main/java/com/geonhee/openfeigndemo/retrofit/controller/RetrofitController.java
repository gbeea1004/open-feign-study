package com.geonhee.openfeigndemo.retrofit.controller;

import com.geonhee.openfeigndemo.retrofit.service.RetrofitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/retrofit")
@RestController
public class RetrofitController {

  private final RetrofitService retrofitService;

  @GetMapping("/users/status")
  public ResponseEntity<String> getStatus() {
    return new ResponseEntity<>(retrofitService.findStatus(), HttpStatus.OK);
  }
}
