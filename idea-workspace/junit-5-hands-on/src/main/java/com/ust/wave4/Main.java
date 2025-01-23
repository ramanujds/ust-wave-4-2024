package com.ust.wave4;

import com.ust.wave4.service.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two inputs : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = calculator.add(a,b);

        System.out.println("Sum = "+sum);

    }
}