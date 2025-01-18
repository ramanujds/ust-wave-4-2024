package generics;

import model.Status;
import model.Task;

public class GenericsExample {
    public static void main(String[] args) {

        Item<String> stringItem = new Item<>("hello");

        System.out.println(stringItem);

        Item<? extends Number> intItem = new Item<>(10.5);


        System.out.println(intItem);

        Task task = new Task(1,"Leran Generics", Status.COMPLETED);

        Item<Task> taskItem = new Item<>(task);

        System.out.println(taskItem);

    }
}
