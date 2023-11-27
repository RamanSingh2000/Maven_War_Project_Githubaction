package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsMavenProject13Application {

	@GetMapping
	public String message(){
		return "Hello Team.Hurray!We have deployed the latest build for githubaction";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsMavenProject13Application.class, args);
	}

}
