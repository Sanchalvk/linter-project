package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args) // Error: indentation level is wrong
    }
    
    public static void exampleMethod() {
    int x = 0 as; // Error: variable declaration should follow naming conventions.
    System.out.println(x);
    }

}
