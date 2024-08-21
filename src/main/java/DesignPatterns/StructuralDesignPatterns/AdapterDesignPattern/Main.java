package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern;

import DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Adaptor.WeightMachineAdaptor;
import DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Adaptor.WeightMachineAdaptorImpl;

public class Main {
    public static void main(String[] args) {
        /*
        this used for conversion form one response to another such as XML to json
        pound to kg etc.
         */

        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineForBabies());

        double weightInKg = weightMachineAdaptor.getWeightInKg();

        System.out.println("weight is :"+weightInKg);
    }
}
