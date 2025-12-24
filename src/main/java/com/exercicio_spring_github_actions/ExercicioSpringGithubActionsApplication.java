package com.exercicio_spring_github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercicioSpringGithubActionsApplication {

	public static void main(String[] args) {
		System.out.println("protegendo a main");
		SpringApplication.run(ExercicioSpringGithubActionsApplication.class, args);
	}

}
