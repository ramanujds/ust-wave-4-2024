package com.ust.wave4.creationaldp.singleton;

public class Store {
    private int itemCount=0;

    private Store(){ }

    private static Store store;

    public static Store getStore(){
        if (store == null){
            store = new Store();
        }
        return store;
    }

    public void increment(){
        itemCount++;
    }

    public void decrement(){
        itemCount--;
    }

    public int getItemCount(){
        return itemCount;
    }

}
