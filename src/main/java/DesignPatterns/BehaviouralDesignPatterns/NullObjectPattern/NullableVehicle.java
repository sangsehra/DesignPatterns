package DesignPatterns.BehaviouralDesignPatterns.NullObjectPattern;

public class NullableVehicle implements Vehicle{
    @Override
    public Integer getFuelCapacity() {
        return 0;
    }

    @Override
    public Integer getSittingCapacity() {
        return 0;
    }
}
