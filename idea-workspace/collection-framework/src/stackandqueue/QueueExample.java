package stackandqueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> persons = new PriorityQueue<>();


        persons.offer("Vivek");
        persons.offer("Andrea");
        persons.offer("Nihad");
        persons.offer("Rogan");

        while (!persons.isEmpty()){
            String current = persons.poll();
            System.out.println(current+ " got Biriyani");
        }


    }

}
