package set;

import model.Status;
import model.Task;
import stackandqueue.TaskManagementApp;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskManagementWithSet {

    // add a new field priority (value 1-5)
    // sort based on priority

//    class CompareByTitle implements Comparator<Task>{
//        @Override
//        public int compare(Task t1, Task t2) {
//            return t1.getTitle().compareTo(t2.getTitle());
//        }
//    }

    Comparator<Task> compareByTitle = new Comparator<Task>() {
        public int compare(Task t1, Task t2) {
            return t1.getTitle().compareTo(t2.getTitle());
        }
    };

    Comparator<Task> compareByTitleSmart = (t1,t2)-> t1.getTitle().compareTo(t2.getTitle());

    // sort based on title (without modifying the Trainee class)
    // Default sort should be based on id
    Set<Task> tasks = new TreeSet<>(compareByTitleSmart);



    void showTasks(){
        System.out.println("Showing all tasks : ");
        for (Task t:tasks){
            System.out.println(t);
        }
    }

    void addSomeTasks(){
        // create 5 task objects and store them
        // make sure no duplicate tasks are allowed
        tasks.add(new Task(1,"Learn OOP Concepts",Status.COMPLETED));
        tasks.add(new Task(2,"Learn Multi Threading",Status.PENDING));
        tasks.add(new Task(3,"List and Set",Status.COMPLETED));
        tasks.add(new Task(4,"Maps",Status.IN_PROGRESS));
    }

    void showTasks(Status status){
        System.out.println("Showing "+status.name()+" tasks : ");
        for (Task t:tasks){
            if(t.getStatus()==status){
                System.out.println(t);
            }
        }
    }

    public static void main(String[] args) {
        TaskManagementWithSet taskManager = new TaskManagementWithSet();
        taskManager.addSomeTasks();

        taskManager.showTasks();
        taskManager.showTasks(Status.COMPLETED);
    }



}
