package com.ust.wave4.solidprinciples.openclose;

public class CashOnDelivery implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment by Cash On Delivery");
    }
}
