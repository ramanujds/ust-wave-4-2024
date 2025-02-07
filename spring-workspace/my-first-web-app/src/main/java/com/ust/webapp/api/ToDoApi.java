package com.ust.webapp.api;

import com.ust.webapp.model.Task;
import com.ust.webapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoApi {

    @Autowired
    private TaskService taskService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getTasks(){
       return taskService.findAllTasks();
    }

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task newTask){
        Task savedTask = taskService.addTask(newTask);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Task findById(@PathVariable int id){
        return taskService.findTaskById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTodo(@PathVariable int id){
        taskService.deleteTodo(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Task updateTask(@PathVariable int id, @RequestBody Task task){
        return taskService.updateTask(id,task);
    }

}
