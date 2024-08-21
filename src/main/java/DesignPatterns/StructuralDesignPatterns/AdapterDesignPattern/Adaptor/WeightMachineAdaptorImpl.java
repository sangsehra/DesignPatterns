package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Adaptor;

import DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

    private WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }
    @Override
    public double getWeightInKg() {
        double weightInPounds = weightMachine.getWeightInPounds();

        return weightInPounds * .45;
    }
}
