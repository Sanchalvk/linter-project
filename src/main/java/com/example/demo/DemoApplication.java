package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        String messageTooLongAndUnnecessary = "This is a very long and unnecessary variable name to trigger a PMD rule.";
        System.out.println("Hello, world!");
    }

    public static class MyClass {
        public void doSomethingVeryComplicated() { // Method name is quite long
            int a = 10;
            int b = 20;
            int result = a + b;
            System.out.println("Result: " + result)
        }
    }
}
