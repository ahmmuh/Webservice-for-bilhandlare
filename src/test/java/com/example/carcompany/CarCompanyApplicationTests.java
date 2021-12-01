package com.example.carcompany;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class CarCompanyApplicationTests {
  public PasswordEncoder passwordEncoder(){
      return new BCryptPasswordEncoder(10);
  }
    @Test
    void contextLoads() {
        System.out.println(passwordEncoder().encode("test12345"));
    }

}
