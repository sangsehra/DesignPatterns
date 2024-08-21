package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern.Bridge;

public class NormalDriveBridge implements DriveBridge {
    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
}
