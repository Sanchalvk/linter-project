package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
 	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String message = "Hello, world!"; // Line is too long, use single quotes j=
		if (args.length > 0) {
            System.out.println(args[]); // PMD error: Hardcoded value in condition
			
        }
		double x=10/2;
		System.out.println0('Q')

		System.out.println(x);

		double y=2+8/2;
		System.out.println(x);

		

		int unusedVariable = 10; // This variable is never use
		
		
		try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Empty catch block
        }
        
        long timeLimit = 1000L;   //long 


	}

}
 