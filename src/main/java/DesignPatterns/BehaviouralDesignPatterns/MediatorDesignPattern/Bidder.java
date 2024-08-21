package DesignPatterns.BehaviouralDesignPatterns.MediatorDesignPattern;

public abstract class Bidder {

    private final Mediator mediator;
    int bidderCode;

    Bidder(Mediator mediator){
        this.mediator=mediator;
    }

    public void bidPrice(int price, int bidderCode){
        mediator.placeBid(price,bidderCode);
        mediator.sendNotification(bidderCode);
        mediator.addBidders();
    }

}
