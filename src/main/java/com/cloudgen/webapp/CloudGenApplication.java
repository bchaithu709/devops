package com.cloudgen.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.cloudgen.Controller","com.cloudgen.Entity","com.cloudgen.Exceptions","com.cloudgen.Model","com.cloudgen.Repository","com.cloudgen.Service","com.cloudgen.ServiceImpl"})
@SpringBootApplication
public class CloudGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGenApplication.class, args);
	}

}