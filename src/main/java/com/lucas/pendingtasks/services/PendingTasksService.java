package com.lucas.pendingtasks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.pendingtasks.domain.PendingTasks;
import com.lucas.pendingtasks.repositories.PendingTasksRepository;

@Service
public class PendingTasksService {

	@Autowired
	private PendingTasksRepository repository;

	public PendingTasks findById(Integer id) {
		Optional<PendingTasks> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<PendingTasks> findAllOpen() {
		List<PendingTasks> list = repository.findAllOpen();
		return list;
	}

	public List<PendingTasks> findAllClose() {
		List<PendingTasks> list = repository.findAllClose();
		return list;
	}

	public List<PendingTasks> findAll() {
		List<PendingTasks> list = repository.findAll();
		return list;
	}

	public PendingTasks create(PendingTasks obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
