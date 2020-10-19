package com.gavin.springfactorypattern.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthenticationFactoryTest {

  @Autowired
  private AuthenticationFactory authenticationFactory;

  @Test
  void 타입별_인증_서비스_로딩_테스트(){
    //given
    AuthenticationType passwordType = AuthenticationType.PASSWORD;
    AuthenticationType fidoType = AuthenticationType.FIDO;
    AuthenticationType deviceType = AuthenticationType.DEVICE;

    //when
    AuthenticationService passwordAuthenticationService = authenticationFactory.getAuthenticationService(passwordType);
    AuthenticationService fidoAuthenticationService = authenticationFactory.getAuthenticationService(fidoType);
    AuthenticationService deviceAuthenticationService = authenticationFactory.getAuthenticationService(deviceType);

    //then
    assertEquals(passwordAuthenticationService.getAuthentiicationType(),AuthenticationType.PASSWORD);
    assertEquals(fidoAuthenticationService.getAuthentiicationType(),AuthenticationType.FIDO);
    assertEquals(deviceAuthenticationService.getAuthentiicationType(),AuthenticationType.DEVICE);

    // show
    passwordAuthenticationService.validateAuthentication();
    fidoAuthenticationService.validateAuthentication();
    deviceAuthenticationService.validateAuthentication();
  }
}