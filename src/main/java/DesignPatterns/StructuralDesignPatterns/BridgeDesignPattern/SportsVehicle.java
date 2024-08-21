package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern;

import DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern.Bridge.SportDriveBridge;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportDriveBridge());
    }
}
