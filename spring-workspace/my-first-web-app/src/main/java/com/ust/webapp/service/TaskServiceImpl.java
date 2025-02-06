package com.ust.webapp.service;

import com.ust.webapp.model.Task;
import com.ust.webapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepo;


    public Task addTask(Task task) {
        return taskRepo.save(task);
    }

    public Task findTaskById(int id) {
        return taskRepo.findById(id).get();
    }

    public List<Task> findAllTasks() {
        return taskRepo.findAll();
    }
}
