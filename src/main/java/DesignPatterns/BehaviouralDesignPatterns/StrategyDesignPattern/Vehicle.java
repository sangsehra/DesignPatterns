package DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
