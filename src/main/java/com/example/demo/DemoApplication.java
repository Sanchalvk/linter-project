package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import java.util.List;  // Unused import - Removed

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        String message = "Hello, world!"; // Removed incorrect comment about single quotes
    }

    public static class MyClass { // Made inner class static
        public void myMethod() { // Removed trailing characters from comment
            System.out.println("Hello");
        }
    }
}
