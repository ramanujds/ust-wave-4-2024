package com.ust.wave4.creationaldp.builder;

import java.util.StringJoiner;

public class Pizza {

    private String size;

    private boolean cheese;
    private boolean mushrooms;
    private boolean pepperoni;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.getSize();
        this.cheese = pizzaBuilder.isCheese();
        this.mushrooms = pizzaBuilder.isMushrooms();
        this.pepperoni = pizzaBuilder.isPepperoni();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
                .add("size='" + size + "'")
                .add("cheese=" + cheese)
                .add("mushrooms=" + mushrooms)
                .add("pepperoni=" + pepperoni)
                .toString();
    }
}
