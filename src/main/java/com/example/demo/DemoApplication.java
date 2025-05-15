package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello, world!");
    }

    public static class MyClass {
        public void printAdditionResult() {
            int a = 10;
            int b = 20;
            int result = a + b;
            System.out.println("Result: " + result);
        }
    }

    public static class ErrorHandlingClass {
        public void readFile(String filename) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Failed to read file: " + filename);
                e.printStackTrace(); // Proper logging
            }
        }
    }

    public static class CalculationClass {
        public int calculateSum(int a, int b) {
            return a + b;
        }
    }
}
