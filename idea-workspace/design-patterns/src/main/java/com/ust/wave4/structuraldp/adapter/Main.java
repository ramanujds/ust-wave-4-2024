package com.ust.wave4.structuraldp.adapter;

public class Main {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        TypeCToLightningAdapter typeCToLightningAdapter = new TypeCToLightningAdapter(iPhone);

        typeCToLightningAdapter.chargeWithLightning();

    }

}
