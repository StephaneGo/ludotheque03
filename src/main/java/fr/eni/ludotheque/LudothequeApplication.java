package fr.eni.ludotheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LudothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LudothequeApplication.class, args);
		System.out.println("Une modif pour la démo");
	}

}
