package DesignPatterns.BehaviouralDesignPatterns.NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        /*
        here bike object wont be present then we generally return null but here we
        have returned default values in class members. It will avoid NPE
         */
        Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");

        System.out.println(vehicle.getFuelCapacity());
        System.out.println(vehicle.getSittingCapacity());
    }
}
