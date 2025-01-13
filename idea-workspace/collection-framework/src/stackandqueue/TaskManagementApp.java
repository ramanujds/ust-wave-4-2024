package stackandqueue;

import model.Status;
import model.Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskManagementApp {

    private Queue<Task> todos = new LinkedList<>();
    private Stack<Task> completedTasks = new Stack<>();

    public void addTask(Task task){
        todos.offer(task);
        System.out.println("Task : "+task.getTitle()+" Added");

    }

    public void processTask(){
        while (!todos.isEmpty()){
            Task current = todos.poll();
            System.out.println("Processing : "+current.getTitle());
            current.setStatus(Status.COMPLETED);
            completedTasks.push(current);
        }
    }

    public void showCompletedTasks(){
        while (!completedTasks.isEmpty()){
            Task current = completedTasks.pop();
            System.out.println(current);
        }
    }

    public static void main(String[] args) {
        TaskManagementApp taskManager = new TaskManagementApp();

        System.out.println("Adding Tasks");
        taskManager.addTask(new Task(1,"Learn Git",Status.PENDING));
        taskManager.addTask(new Task(2,"Learn Java",Status.PENDING));
        taskManager.addTask(new Task(3,"Learn SQL",Status.PENDING));
        taskManager.addTask(new Task(4,"Learn HTML",Status.PENDING));

        System.out.println("Processing Tasks : ");
        taskManager.processTask();

        System.out.println("Completed tasks list : ");
        taskManager.showCompletedTasks();



    }



}
