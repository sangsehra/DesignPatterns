package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern;

import DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern.Bridge.NormalDriveBridge;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDriveBridge());
    }

    public void noOfWheels(){
        System.out.println("wheels are 4");
    }
}
