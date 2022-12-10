package com.springBootTutor;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan
@EnableAutoConfiguration

public class SpringBootTutorApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication app = new SpringApplication(SpringBootTutorApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);	
	}
}
 