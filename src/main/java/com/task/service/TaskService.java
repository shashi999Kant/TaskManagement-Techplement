package com.task.service;

import com.task.entities.Task;

public interface TaskService {
    Task createTask(Task task);
    Task markTaskAsCompleted(Long taskId);
    Task getTaskById(Long id);

}

