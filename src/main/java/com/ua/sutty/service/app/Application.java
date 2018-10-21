package com.ua.sutty.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.ua.sutty.service")
@EnableJpaRepositories(basePackages = "com.ua.sutty.service.repositories")
@EntityScan(basePackages = "com.ua.sutty.service.models")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
