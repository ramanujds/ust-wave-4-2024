package com.ust.webapp.api;

import com.ust.webapp.model.Task;
import com.ust.webapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoApi {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getTasks(){
       return taskService.findAllTasks();
    }

    @PostMapping
    public Task addTask(@RequestBody Task newTask){
        return taskService.addTask(newTask);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable int id){
        return taskService.findTaskById(id);
    }

}
