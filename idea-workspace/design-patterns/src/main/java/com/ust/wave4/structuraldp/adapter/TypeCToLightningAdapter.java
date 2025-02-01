package com.ust.wave4.structuraldp.adapter;

public class TypeCToLightningAdapter implements LightningCharger{

    private IPhone iPhone;

    public TypeCToLightningAdapter(IPhone iPhone){
        this.iPhone=iPhone;
    }

    @Override
    public void chargeWithLightning() {
        System.out.println("TypeC to Lightning Adapter");
        iPhone.charge();
    }
}
