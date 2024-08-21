package DesignPatterns.BehaviouralDesignPatterns.NullObjectPattern;

public class Car implements Vehicle{
    @Override
    public Integer getFuelCapacity() {
        return 44;
    }

    @Override
    public Integer getSittingCapacity() {
        return 2;
    }
}
