package com.ust.webapp.repository;

import com.ust.webapp.model.Task;

import java.util.List;

public interface TaskRepository {

    Task addTask(Task task);

    Task findTaskById(int id);

    List<Task> findAllTasks();

}
