package DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
