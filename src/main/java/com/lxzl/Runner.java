package com.lxzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lxzl.controller.LoginController;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication()
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(LoginController.class, args);
    }
}
