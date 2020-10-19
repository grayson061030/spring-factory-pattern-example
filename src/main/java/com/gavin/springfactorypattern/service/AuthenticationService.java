package com.gavin.springfactorypattern.service;

public interface AuthenticationService {

  AuthenticationType getAuthentiicationType();
  void validateAuthentication();

}
