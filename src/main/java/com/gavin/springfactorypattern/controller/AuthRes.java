package com.gavin.springfactorypattern.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AuthRes {
  private String message;
  private String code;
}
