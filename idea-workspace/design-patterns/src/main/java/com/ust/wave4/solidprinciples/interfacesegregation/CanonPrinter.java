package com.ust.wave4.solidprinciples.interfacesegregation;

public class CanonPrinter implements Printer, Scanner{


    public void print() {
        System.out.println("Printing with Canon Printer");
    }

    public void scan() {
        System.out.println("Scanning with Canon Printer");
    }
}
