package DesignPatterns.BehaviouralDesignPatterns.MediatorDesignPattern;

public interface Mediator {

    public void placeBid(int price, int bidderId);

    public void sendNotification(int bidderId);

    public void addBidders();
}
