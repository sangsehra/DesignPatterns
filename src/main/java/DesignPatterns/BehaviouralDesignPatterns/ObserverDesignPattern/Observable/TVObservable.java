package DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class TVObservable implements ItemStockObservable{

    List<NotificationObserver> TVObserverList = new ArrayList<>();

    int iphoneStock = 0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        TVObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        TVObserverList.remove(notificationObserver);
    }

    @Override
    public void updateStock(int itemSize) {
        if (itemSize<0){
            notifyObservers();
        }
        iphoneStock+=itemSize;
    }

    @Override
    public void notifyObservers(){
        for (NotificationObserver notificationObserver : TVObserverList){
            notificationObserver.notifyObserver();
        }
    }
}
