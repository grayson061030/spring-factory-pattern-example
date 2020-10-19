package com.gavin.springfactorypattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthenticationPasswordService implements AuthenticationService{

  @Override
  public AuthenticationType getAuthentiicationType() {
    return AuthenticationType.PASSWORD;
  }

  @Override
  public void validateAuthentication() {
    log.info("==================> password validation");
  }
}
