package com.ust.wave4.creationaldp.builder;

public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new PizzaBuilder("medium")
                .build();

        System.out.println(pizza1);

    }

}
