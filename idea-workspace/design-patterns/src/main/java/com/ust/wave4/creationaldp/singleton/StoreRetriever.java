package com.ust.wave4.creationaldp.singleton;

public class StoreRetriever {

    private Store store = Store.getStore();

    public void showCurrentItemCount(){
        int count = store.getItemCount();
        System.out.println("Total items : "+count);
    }

}
