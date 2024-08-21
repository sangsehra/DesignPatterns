package DesignPatterns.BehaviouralDesignPatterns.NullObjectPattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicleType){
        if (vehicleType.equals("CAR")){
            return new Car();
        }
        return new NullableVehicle();
    }
}
