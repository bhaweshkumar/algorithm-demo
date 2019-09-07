package com.bhaweshkumar.algorithm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bhaweshkumar.algorithm.demo"})
public class DemoApplication {
    //http://localhost:8080/api/swagger-ui.html
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
