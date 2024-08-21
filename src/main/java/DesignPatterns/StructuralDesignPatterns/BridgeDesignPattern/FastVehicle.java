package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern;

import DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern.Bridge.SportDriveBridge;

public class FastVehicle extends Vehicle {
    FastVehicle() {
        super(new SportDriveBridge());
    }
}
