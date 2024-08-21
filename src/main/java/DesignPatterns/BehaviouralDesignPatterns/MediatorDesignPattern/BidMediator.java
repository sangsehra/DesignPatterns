package DesignPatterns.BehaviouralDesignPatterns.MediatorDesignPattern;

import java.util.HashSet;
import java.util.Set;

public class BidMediator implements Mediator{

    Set<Integer> bidderIdList = new HashSet<>();
    int noOfBids =0;
    int totalBids =0;

    @Override
    public void placeBid(int price, int bidderId) {
        System.out.println(bidderId+ ", has placed a bid of : "+price);
        totalBids+=price;
        bidderIdList.add(bidderId);
    }

    @Override
    public void sendNotification(int bidderId) {
        for (int id : bidderIdList){
            if (id!=bidderId){
                System.out.println(bidderId+ ", has placed a bid !! sent to bidder -->"+id);
            }
        }
    }

    @Override
    public void addBidders() {
        noOfBids++;
        System.out.println("total bids placed are :"+noOfBids);

    }
}
