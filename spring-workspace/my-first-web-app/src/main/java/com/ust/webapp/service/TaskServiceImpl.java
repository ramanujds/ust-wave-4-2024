package com.ust.webapp.service;

import com.ust.webapp.exception.RecordNotFoundException;
import com.ust.webapp.model.Task;
import com.ust.webapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepo;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task addTask(Task task) {
        return taskRepo.save(task);
    }

    public Task findTaskById(int id) {
        return taskRepo.findById(id)
                .orElseThrow(()->new RecordNotFoundException("Not tasks found with id : "+id));
    }

    public List<Task> findAllTasks() {
        return taskRepo.findAll();
    }

    public void deleteTodo(int id){
        taskRepo.deleteById(id);
    }



    @Override
    public Task updateTask(int id, Task task) {
        Task taskToUpdate = findTaskById(id);
        if (task.getTitle()!=null)
            taskToUpdate.setTitle(task.getTitle());
        if (task.getDueDate()!=null)
            taskToUpdate.setDueDate(task.getDueDate());
        if (task.getPriority()!=0){
            taskToUpdate.setPriority(task.getPriority());
        }

       return taskRepo.save(taskToUpdate);
    }


    public List<Task> searchTodosByTitle(String title) {
        return taskRepo.findByTitleStartsWith(title);
    }

}
