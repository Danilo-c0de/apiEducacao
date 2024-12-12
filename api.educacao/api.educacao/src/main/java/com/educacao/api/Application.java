package com.educacao.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Anotação que marca a classe como ponto de entrada para a aplicação Spring Boot
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // Inicia a aplicação Spring Boot
    }
}