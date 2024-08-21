package DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements ItemStockObservable{

    List<NotificationObserver> iPhoneObserverList = new ArrayList<>();

    int iphoneStock = 0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        iPhoneObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        iPhoneObserverList.remove(notificationObserver);
    }

    @Override
    public void updateStock(int itemSize) {
        if (iphoneStock<=0){
            notifyObservers();
        }
        iphoneStock+=itemSize;
    }

    @Override
    public void notifyObservers(){
        for (NotificationObserver notificationObserver : iPhoneObserverList){
            notificationObserver.notifyObserver();
        }
    }
}
