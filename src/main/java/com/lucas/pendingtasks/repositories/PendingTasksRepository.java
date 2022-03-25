package com.lucas.pendingtasks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.pendingtasks.domain.PendingTasks;

@Repository
public interface PendingTasksRepository extends JpaRepository<PendingTasks, Integer> {

}
