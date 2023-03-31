package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.util.HashMap;

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class HelloSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "cat docker/docker-compose.prod.yml > /root/docker-files/hello-spring.yml";
    }


}
