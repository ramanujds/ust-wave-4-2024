package com.ust.wave4.solidprinciples.openclose;

public class PaymentService {

    public void makePayment(String mode){
        switch (mode){
            case "cash":
                System.out.println("Cash On Delivery Payment");
                break;
            case "card":
                System.out.println("Payment made by Card");
                break;
        }
    }

}
