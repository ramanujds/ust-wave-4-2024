package map;

import model.Status;
import model.Task;

import java.util.*;

public class TaskManagementWithMap {


    Map<Integer,Task> tasks = new TreeMap<>();


    void showTasks(){
        System.out.println("Showing all tasks : ");
        for (int id:tasks.keySet()){
            System.out.println(tasks.get(id));
        }
    }

    void addSomeTasks(){
        // create 5 task objects and store them
        // make sure no duplicate tasks are allowed
        tasks.put(1,new Task(1,"Learn OOP Concepts",Status.COMPLETED));
        tasks.put(2,new Task(2,"Learn Multi Threading",Status.PENDING));
        tasks.put(3,new Task(3,"List and Set",Status.COMPLETED));
        tasks.put(4,new Task(4,"Maps",Status.IN_PROGRESS));
    }

    void showTasks(Status status){
        System.out.println("Showing "+status.name()+" tasks : ");
        for (int id:tasks.keySet()){
            Task current = tasks.get(id);
            if (current.getStatus()==status)
                System.out.println(current);
        }
    }

    public static void main(String[] args) {
        TaskManagementWithMap taskManager = new TaskManagementWithMap();
        taskManager.addSomeTasks();

        taskManager.showTasks();
        taskManager.showTasks(Status.COMPLETED);
    }



}
