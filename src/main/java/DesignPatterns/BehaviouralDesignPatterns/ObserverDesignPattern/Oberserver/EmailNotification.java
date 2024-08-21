package DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver;

import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable.ItemStockObservable;

public class EmailNotification implements NotificationObserver{

    String email;
    ItemStockObservable itemStockObservable;

    public EmailNotification(ItemStockObservable itemStockObservable, String email){
        this.itemStockObservable=itemStockObservable;
        this.email=email;
    }

    @Override
    public void notifyObserver() {
        System.out.println("email sent to :"+this.email);
    }
}
