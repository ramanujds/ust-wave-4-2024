package com.ust.webapp.service;

import com.ust.webapp.model.Task;

import java.util.List;

public interface TaskService {

    Task addTask(Task task);

    Task findTaskById(int id);

    List<Task> findAllTasks();

    void deleteTodo(int id);

    Task updateTask(int id, Task task);

}
