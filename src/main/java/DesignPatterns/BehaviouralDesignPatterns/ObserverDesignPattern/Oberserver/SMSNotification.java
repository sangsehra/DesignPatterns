package DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver;

import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable.ItemStockObservable;

public class SMSNotification implements NotificationObserver{
    String mobileNo;
    ItemStockObservable itemStockObservable;

    public SMSNotification(ItemStockObservable itemStockObservable, String mobileNo){
        this.itemStockObservable=itemStockObservable;
        this.mobileNo=mobileNo;
    }

    @Override
    public void notifyObserver() {
        System.out.println("sms sent to :"+this.mobileNo);
    }
}
