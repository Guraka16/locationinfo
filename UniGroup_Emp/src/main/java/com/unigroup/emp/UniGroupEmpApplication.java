package com.unigroup.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages= {"com.unigroup"})
@SpringBootApplication
public class UniGroupEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniGroupEmpApplication.class, args);
	}
}
