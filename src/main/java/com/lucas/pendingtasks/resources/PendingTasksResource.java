package com.lucas.pendingtasks.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucas.pendingtasks.domain.PendingTasks;
import com.lucas.pendingtasks.services.PendingTasksService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/tasks")
public class PendingTasksResource {

	@Autowired
	private PendingTasksService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<PendingTasks> findById(@PathVariable Integer id) {
		PendingTasks obj = service.findById(id);
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

	@GetMapping
	public ResponseEntity<List<PendingTasks>> listAll() {
		List<PendingTasks> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<PendingTasks> create(@RequestBody PendingTasks obj) {
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
