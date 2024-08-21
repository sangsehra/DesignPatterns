package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Adaptee;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPounds() {
        return 25;
    }
}
