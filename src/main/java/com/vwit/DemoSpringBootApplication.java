package com.vwit;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 // step 3 
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration //this annotation enables spring boots auto configuration mechanism  

//OR Step 3 and line no. 15 is combination of above 3 annotation
//@SpringBootApplication= @Configuration + @ComponentScan + @EnableAutoConfiguration

@SpringBootApplication
public class DemoSpringBootApplication {
	public static void main(String[] args) {
		System.out.println("SpringBoot Demo");
		//step 4
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}
}




















