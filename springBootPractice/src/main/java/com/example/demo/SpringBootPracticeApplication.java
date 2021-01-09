package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
	ApplicationContext con = SpringApplication.run(SpringBootPracticeApplication.class, args);
	Person person=con.getBean(Person.class);
	person.eat();
	}

}
