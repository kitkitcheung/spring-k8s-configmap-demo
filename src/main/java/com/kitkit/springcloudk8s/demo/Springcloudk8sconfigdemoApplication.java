package com.kitkit.springcloudk8s.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class Springcloudk8sconfigdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudk8sconfigdemoApplication.class, args);
    }

}
