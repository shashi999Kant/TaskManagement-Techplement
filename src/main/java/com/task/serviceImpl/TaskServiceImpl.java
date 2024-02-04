package com.task.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entities.Task;
import com.task.repository.TaskRepository;
import com.task.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {

        return taskRepository.save(task);
    }

    @Override
    public Task markTaskAsCompleted(Long taskId) {
    	Task task = this.taskRepository.findById(taskId).get();
    	task.setCompleted(true);
        return task;
    }

	@Override
	public Task getTaskById(Long id) {
		// TODO Auto-generated method stub
		return this.taskRepository.findById(id).get();
	}

}
