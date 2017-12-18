package com.channelit.crudangularspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.channelit.crudangularspringboot.entity")
public class CrudangularspringbootApplication {

	//commit on branch level
	public static void main(String[] args) {
		System.out.println("start application");
		SpringApplication.run(CrudangularspringbootApplication.class, args);
		
		
	}
}
