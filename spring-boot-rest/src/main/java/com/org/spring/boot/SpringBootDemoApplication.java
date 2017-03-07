package com.org.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {
    // start the application here also can be started using spring boot cli without pom.xml
    public static void main(String...args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
