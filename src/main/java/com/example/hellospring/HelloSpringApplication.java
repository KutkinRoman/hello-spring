package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class HelloSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/test")
    public Object test(){
        return new HashMap<>(){{
            put("LocalDateTime", LocalDateTime.now());
            put("LocalDate", LocalDate.now());
            put("LocalTime", LocalTime.now());
            put("SPRING", "HELLO");
            put("MAPPING", "GetMapping");
        }};
    }

    @PostMapping("/testPOST")
    public Object testPOST(){
        return new HashMap<>(){{
            put("LocalDateTime", LocalDateTime.now());
            put("LocalDate", LocalDate.now());
            put("LocalTime", LocalTime.now());
            put("SPRING", "HELLO");
            put("MAPPING", "PostMapping");
        }};
    }
}
