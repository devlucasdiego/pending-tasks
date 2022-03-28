package com.lucas.pendingtasks.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lucas.pendingtasks.domain.PendingTasks;

@Repository
public interface PendingTasksRepository extends JpaRepository<PendingTasks, Integer> {

	@Query("SELECT obj FROM PendingTasks obj WHERE obj.finalizado = false ORDER BY obj.dataFinalizar")
	List<PendingTasks> findAllOpen();

	@Query("SELECT obj FROM PendingTasks obj WHERE obj.finalizado = true ORDER BY obj.dataFinalizar")
	List<PendingTasks> findAllClose();
}
