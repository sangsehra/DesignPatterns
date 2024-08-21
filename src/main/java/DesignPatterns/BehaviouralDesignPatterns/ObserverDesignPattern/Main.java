package DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver.EmailNotification;
import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver.NotificationObserver;
import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Oberserver.SMSNotification;
import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable.IphoneObservable;
import DesignPatterns.BehaviouralDesignPatterns.ObserverDesignPattern.Observable.ItemStockObservable;

public class Main {
    public static void main(String[] args) {
        /*
        Here Notify me in amazon LLD is implemented where each item observables will maintain the list of Observers
        and whenever item stock is increased users notified
         */

        ItemStockObservable iphoneStockObserve = new IphoneObservable();
     //   ItemStockObservable tvStockObservable = new TVObservable();

        NotificationObserver rajatObserver = new EmailNotification(iphoneStockObserve,"sangsehra@gmail.com");
        NotificationObserver sangamObserver = new SMSNotification(iphoneStockObserve,"3434534543");

        iphoneStockObserve.add(rajatObserver);
        iphoneStockObserve.add(sangamObserver);

        iphoneStockObserve.updateStock(10);
        iphoneStockObserve.updateStock(10);

        iphoneStockObserve.updateStock(100);
    }
}
