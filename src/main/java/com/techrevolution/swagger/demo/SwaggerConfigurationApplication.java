package com.techrevolution.swagger.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerConfigurationApplication.class, args);
    }


    //http://localhost:8080/v2/api-docs hit this url.
}
