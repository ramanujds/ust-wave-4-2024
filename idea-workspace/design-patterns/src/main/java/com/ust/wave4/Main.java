package com.ust.wave4;

import com.ust.wave4.solidprinciples.interfacesegregation.CanonPrinter;
import com.ust.wave4.solidprinciples.interfacesegregation.HPPrinter;
import com.ust.wave4.solidprinciples.interfacesegregation.Printer;
import com.ust.wave4.solidprinciples.openclose.*;

public class Main {
    public static void main(String[] args) {

//        PaymentService paymentService = new PaymentService();
//        paymentService.makePayment("card");
//
//        EnhancedPaymentService ePaymentService = new EnhancedPaymentService();
//        ePaymentService.makePayment(new UPIPayment());

        CanonPrinter printer = new CanonPrinter();
        printer.print();
        printer.scan();


    }
}