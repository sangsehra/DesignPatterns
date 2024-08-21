package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern.Bridge;

public class SportDriveBridge implements DriveBridge {
    @Override
    public void drive() {
        System.out.println("sports drive strategy");
    }
}
