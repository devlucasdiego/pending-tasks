package com.lucas.pendingtasks.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.pendingtasks.domain.PendingTasks;
import com.lucas.pendingtasks.services.PendingTasksService;

@RestController
@RequestMapping(value = "/tasks")
public class PendingTasksResource {

	@Autowired
	private PendingTasksService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<PendingTasks> findById(@PathVariable Integer Id) {
		PendingTasks obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/open")
	public ResponseEntity<List<PendingTasks>> listOpen() {
		List<PendingTasks> list = service.findAllOpen();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/close")
	public ResponseEntity<List<PendingTasks>> listClose() {
		List<PendingTasks> list = service.findAllClose();
		return ResponseEntity.ok().body(list);
	}
}
