package DesignPatterns.BehaviouralDesignPatterns.MediatorDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
        same object of mediator has to be passed across the bidders as to keep the person same
        he will know both and act accordingly
         */

        Mediator mediator = new BidMediator();
        Bidder rajat = new RajatBidder(mediator);
        Bidder sangam = new SangamBidder(mediator);

        rajat.bidPrice(100,11);

        sangam.bidPrice(1100,132);

        rajat.bidPrice(1101,11);
    }
}
