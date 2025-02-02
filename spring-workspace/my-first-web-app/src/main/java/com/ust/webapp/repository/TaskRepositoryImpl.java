package com.ust.webapp.repository;

import com.ust.webapp.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskRepositoryImpl implements TaskRepository {

    List<Task> taskDb = new ArrayList<>();

    public Task addTask(Task task) {
        taskDb.add(task);
        return task;
    }

    public Task findTaskById(int id) {
       for (Task t:taskDb){
           if (t.id()==id){
               return t;
           }
       }
       return null;
    }

    public List<Task> findAllTasks() {
        return taskDb;
    }
}
