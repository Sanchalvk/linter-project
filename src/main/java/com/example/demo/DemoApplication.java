package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
 	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String message = "Hello, world!"; // Line is too long, use single quotes j=
		if (args.length > 0) {
            System.out.println(args[0]); // PMD error: Hardcoded value in condition
			int unusedVariable = 10; // This variable is never use
        }
        
        long timeLimit = 1000L;   //long 


	}

}
 