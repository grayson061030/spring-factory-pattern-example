package com.gavin.springfactorypattern.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * 팩토리
 */
@Component
public class AuthenticationFactory {

  private final Map<AuthenticationType, AuthenticationService> authenticationServiceMap = new HashMap<>();
  //생성자 주입으로 인증서비스를 상송하고 있는 bean 들을 주입
  public AuthenticationFactory(List<AuthenticationService> authenticationServiceList) {
    // if not found authentication bean -> exception
    if (ObjectUtils.isEmpty(authenticationServiceList)) {
      throw new IllegalArgumentException("Not found service");
    }
    for (AuthenticationService authenticationService : authenticationServiceList) {
      this.authenticationServiceMap
          .put(authenticationService.getAuthentiicationType(), authenticationService);
    }
  }

  public AuthenticationService getAuthenticationService(AuthenticationType type) {
    // 타입에 해당하는 인증서비스의 bean return
    return authenticationServiceMap.get(type);
  }
}
