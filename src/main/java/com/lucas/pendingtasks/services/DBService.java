package com.lucas.pendingtasks.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.pendingtasks.domain.PendingTasks;
import com.lucas.pendingtasks.repositories.PendingTasksRepository;

@Service
public class DBService {

	@Autowired
	private PendingTasksRepository pendingTasksRepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		PendingTasks t1 = new PendingTasks(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);
		PendingTasks t2 = new PendingTasks(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("22/03/2021"),
				true);
		PendingTasks t3 = new PendingTasks(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("21/03/2022"),
				false);
		PendingTasks t4 = new PendingTasks(null, "Meditar", "Meditar durante 30 minutos pela manhã",
				sdf.parse("27/03/2021"), false);
		PendingTasks t5 = new PendingTasks(null, "Correr", "Correr 20 kilometros ", sdf.parse("27/09/2021"), false);
		PendingTasks t6 = new PendingTasks(null, "Trabalho", "Trabalho da faculdade para apresentar",
				sdf.parse("27/05/2021"), false);

		pendingTasksRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}
}
