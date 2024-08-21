package DesignPatterns.BehaviouralDesignPatterns.MediatorDesignPattern;

public class SangamBidder extends Bidder{

    SangamBidder(Mediator mediator) {
        super(mediator);
        System.out.println("Sangam has joined to bid");
    }
}
