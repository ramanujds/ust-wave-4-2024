package com.ust.wave4.solidprinciples.interfacesegregation;

public class HPPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing with HP Printer");
    }

}
