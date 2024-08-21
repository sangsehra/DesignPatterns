package DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.SportDriveStrategy;

public class FastVehicle extends Vehicle{
    FastVehicle() {
        super(new SportDriveStrategy());
    }
}
