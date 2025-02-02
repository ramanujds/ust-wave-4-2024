package com.ust.webapp.service;

import com.ust.webapp.model.Task;
import com.ust.webapp.repository.TaskRepository;
import com.ust.webapp.repository.TaskRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepo;

    public Task addTask(Task task) {
        return taskRepo.addTask(task);
    }

    public Task findTaskById(int id) {
        return taskRepo.findTaskById(id);
    }

    public List<Task> findAllTasks() {
        return taskRepo.findAllTasks();
    }
}
