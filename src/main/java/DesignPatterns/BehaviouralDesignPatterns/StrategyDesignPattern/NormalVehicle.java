package DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }

    public void noOfWheels(){
        System.out.println("wheels are 4");
    }
}
