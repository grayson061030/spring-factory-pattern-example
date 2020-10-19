package com.gavin.springfactorypattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthenticationDeviceService implements AuthenticationService{

  @Override
  public AuthenticationType getAuthentiicationType() {
    return AuthenticationType.DEVICE;
  }

  @Override
  public void validateAuthentication() {
    log.info("==================> devicee validation");
  }
}
