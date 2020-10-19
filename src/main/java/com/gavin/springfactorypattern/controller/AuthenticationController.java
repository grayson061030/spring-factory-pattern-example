package com.gavin.springfactorypattern.controller;

import com.gavin.springfactorypattern.service.AuthenticationFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

  private final AuthenticationFactory authenticationFactory;

  public AuthenticationController(
      AuthenticationFactory authenticationFactory) {
    this.authenticationFactory = authenticationFactory;
  }

  @PostMapping("/validation")
  public AuthRes authValidate(@RequestBody AuthReq authReq){
    authenticationFactory.getAuthenticationService(authReq.getAuthType()).validateAuthentication();
    return AuthRes.builder()
        .code(authReq.getAuthType().name())
        .message("success")
        .build();
  }
}
