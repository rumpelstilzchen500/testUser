package com.api.TestUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class TestUserApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(TestUserApplication.class, args);
    }
}
