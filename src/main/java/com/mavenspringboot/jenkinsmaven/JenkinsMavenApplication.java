package com.mavenspringboot.jenkinsmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsMavenApplication {

	@GetMapping("/")
	String index(){
		return "Hello Jenkins maven V1";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsMavenApplication.class, args);
	}

}
