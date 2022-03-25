package com.lucas.pendingtasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PendingTasksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PendingTasksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
