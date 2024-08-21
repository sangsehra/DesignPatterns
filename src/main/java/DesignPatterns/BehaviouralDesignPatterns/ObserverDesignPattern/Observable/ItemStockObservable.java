package DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver.NotificationObserver;

public interface ItemStockObservable {

    void add(NotificationObserver notificationObserver);

    void remove(NotificationObserver notificationObserver);

    void updateStock(int itemSize);

    void notifyObservers();

}
