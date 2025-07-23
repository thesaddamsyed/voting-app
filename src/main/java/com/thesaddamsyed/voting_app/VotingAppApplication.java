package com.thesaddamsyed.voting_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thesaddamsyed.voting_app.utils.EnvLoader;

@SpringBootApplication
public class VotingAppApplication {
	public static void main(String[] args) {
		EnvLoader.loadDotenv();
		SpringApplication.run(VotingAppApplication.class, args);
	}

}
