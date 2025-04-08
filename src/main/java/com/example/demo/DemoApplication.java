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
        public void addition() { // Method name is quite long
            int a = 10;
            int b = 20;
            int result = a + b;
            System.out.println("Result: " + result);
        }
    }

    public class ErrorHandlingClass {
    public void readFile(String filename) {
        try {
            // ... code that might throw IOException ...
        } catch (java.io.IOException e) {
            // Ignoring the exception! This is bad.
        }
    }
}


    public class CalculationClass {
    public int calculateSomething(int a, int b) {
        int sum = a + b;
        int difference = a - b; // 'difference' is declared but never used
        return sum;
    }
}

}
