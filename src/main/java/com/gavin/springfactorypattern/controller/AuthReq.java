package com.gavin.springfactorypattern.controller;

import com.gavin.springfactorypattern.service.AuthenticationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthReq {
  private AuthenticationType authType;
  private String name;
}
