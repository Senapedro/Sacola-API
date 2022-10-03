package me.dio.Sacola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.Embeddable;

@EnableWebMvc
@SpringBootApplication
public class SacolaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SacolaApiApplication.class, args);
	}

}
