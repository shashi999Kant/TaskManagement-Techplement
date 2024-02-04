package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
