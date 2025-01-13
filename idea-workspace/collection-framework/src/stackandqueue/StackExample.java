package stackandqueue;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java Programming");
        books.push("SQL Advanced");
        books.push("Learn C++");
        books.push("Theory of Everything");


        while (!books.empty()){
            String current = books.pop();
            System.out.println(current);
        }


    }
}
