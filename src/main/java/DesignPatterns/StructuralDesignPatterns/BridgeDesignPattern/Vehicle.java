package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern;


import DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern.Bridge.DriveBridge;

public abstract class Vehicle {
    DriveBridge driveBridge;

    Vehicle(DriveBridge driveBridge){
        this.driveBridge = driveBridge;
    }

    public void drive(){
        driveBridge.drive();
    }
}
