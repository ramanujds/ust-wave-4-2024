package com.ust.wave4.solidprinciples.openclose;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made by Card");
    }
}
