package com.example.springbootcicddemo.springbootcruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudDemoApplication.class, args);

        System.out.println("Pipeline Appliation created succssfully");
    }



     @GetMapping("/hi")
    public String createhi(){
    return "helloo india !";
    }
}

