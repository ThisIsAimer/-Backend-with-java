package com.example.starting_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartingSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StartingSpringApplication.class, args);

		Programmer person = context.getBean(Programmer.class);// spring making your object!
		person.code();
		person.compiling();
	}

}
