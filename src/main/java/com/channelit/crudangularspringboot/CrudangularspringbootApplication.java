package com.channelit.crudangularspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.channelit.crudangularspringboot.entity")
public class CrudangularspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudangularspringbootApplication.class, args);
	}
}
