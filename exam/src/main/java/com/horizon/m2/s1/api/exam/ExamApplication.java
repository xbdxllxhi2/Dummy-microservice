package com.horizon.m2.s1.api.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExamApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExamApplication.class, args);
  }



}
