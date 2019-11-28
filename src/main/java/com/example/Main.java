package com.example;

import io.rollout.rox.server.Rox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
@RestController
public class Main {
 
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Rox.setup("5de03af3676b362cfb74f712").get();
		SpringApplication.run(Main.class, args);
	}
 
	@GetMapping("/ping")
	public String ping() {
		return "Pong!!  " ;
	}
}
