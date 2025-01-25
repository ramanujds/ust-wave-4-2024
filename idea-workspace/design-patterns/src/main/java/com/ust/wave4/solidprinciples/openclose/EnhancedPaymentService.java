package com.ust.wave4.solidprinciples.openclose;


public class EnhancedPaymentService {

    public void makePayment(Payment paymentMode){
        paymentMode.pay();
    }

}
