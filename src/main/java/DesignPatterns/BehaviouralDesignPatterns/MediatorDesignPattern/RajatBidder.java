package DesignPatterns.BehaviouralDesignPatterns.MediatorDesignPattern;

public class RajatBidder extends Bidder{
    RajatBidder(Mediator mediator) {
        super(mediator);
        System.out.println("rajat has joined to bid");
    }
}
