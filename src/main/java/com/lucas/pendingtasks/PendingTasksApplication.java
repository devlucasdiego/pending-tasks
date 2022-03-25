package com.lucas.pendingtasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucas.pendingtasks.domain.PendingTasks;
import com.lucas.pendingtasks.repositories.PendingTasksRepository;

@SpringBootApplication
public class PendingTasksApplication implements CommandLineRunner {

	@Autowired
	private PendingTasksRepository pendingTasksRepository;

	public static void main(String[] args) {
		SpringApplication.run(PendingTasksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		PendingTasks task1 = new PendingTasks(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);

		pendingTasksRepository.saveAll(Arrays.asList(task1));
	}

}
