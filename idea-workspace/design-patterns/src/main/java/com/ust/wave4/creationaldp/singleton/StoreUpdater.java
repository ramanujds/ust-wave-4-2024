package com.ust.wave4.creationaldp.singleton;

public class StoreUpdater {

    private Store store = Store.getStore();
    public void addItem(){
        store.increment();
    }

    public void removeItem(){
        store.decrement();
    }

}
