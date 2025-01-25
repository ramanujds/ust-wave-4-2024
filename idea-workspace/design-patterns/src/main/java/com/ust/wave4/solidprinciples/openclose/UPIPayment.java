package com.ust.wave4.solidprinciples.openclose;

public class UPIPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment made by UPI");
    }
}
