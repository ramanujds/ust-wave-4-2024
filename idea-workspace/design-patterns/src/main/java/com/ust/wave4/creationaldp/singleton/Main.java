package com.ust.wave4.creationaldp.singleton;

public class Main {

    public static void main(String[] args) {

        StoreUpdater storeUpdater = new StoreUpdater();
        StoreRetriever storeRetriever = new StoreRetriever();

        storeRetriever.showCurrentItemCount(); // 0
        storeUpdater.addItem(); // 1
        storeUpdater.addItem(); // 2
        storeRetriever.showCurrentItemCount(); // 2
        storeUpdater.removeItem(); // 1
        storeRetriever.showCurrentItemCount(); // 1

    }

}
