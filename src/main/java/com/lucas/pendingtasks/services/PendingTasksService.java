package com.lucas.pendingtasks.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.pendingtasks.domain.PendingTasks;
import com.lucas.pendingtasks.repositories.PendingTasksRepository;

@Service
public class PendingTasksService {

	@Autowired
	private PendingTasksRepository repository;

	public PendingTasks findById(Integer Id) {
		Optional<PendingTasks> obj = repository.findById(Id);
		return obj.orElse(null);
	}

}