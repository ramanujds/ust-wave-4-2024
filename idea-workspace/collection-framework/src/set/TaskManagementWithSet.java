package set;

import model.Status;
import model.Task;
import stackandqueue.TaskManagementApp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskManagementWithSet {


    // sort based on title (without modifying the Trainee class)
    // Default sort should be based on id
    Set<Task> tasks = new TreeSet<>();



    void showTasks(){

    }

    void addSomeTasks(){
        // create 5 task objects and store them
        // make sure no duplicate tasks are allowed
    }

    void showTasks(Status status){
        // Print all the tasks based on status
    }

    public static void main(String[] args) {
        TaskManagementWithSet taskManager = new TaskManagementWithSet();
        taskManager.showTasks();
    }



}
