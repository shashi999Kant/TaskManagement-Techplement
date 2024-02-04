package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.entities.Task;
import com.task.entities.User;
import com.task.service.TaskService;
import com.task.service.UserService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
    
    @Autowired
    private UserService userService;

    @PostMapping 
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{taskId}/assign/{userId}")
    public Task assignTask(@PathVariable Long taskId, @PathVariable Long userId) {
    	User user = this.userService.findUserById(userId);
    	Task task = this.taskService.getTaskById(taskId);
    		task.setUser(user);
    		
    		return task;
    }

    @PutMapping("/{taskId}/complete")
    public Task markTaskAsCompleted(@PathVariable Long taskId) {
        return taskService.markTaskAsCompleted(taskId);
    }

}
