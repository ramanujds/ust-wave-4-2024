package com.ust.wave4.creationaldp.builder;

public class PizzaBuilder {

    private String size;

    private boolean cheese;
    private boolean mushrooms;
    private boolean pepperoni;

    public PizzaBuilder(String size){
        this.size = size;
    }

    public PizzaBuilder withCheese(){
        this.cheese = true;
        return this;
    }

    public PizzaBuilder withPepperoni(){
        this.pepperoni = true;
        return this;
    }


    public PizzaBuilder withMushroom(){
        this.mushrooms = true;
        return this;
    }

    public Pizza build(){
        Pizza pizza = new Pizza(this);
        return pizza;
    }

    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }
}
