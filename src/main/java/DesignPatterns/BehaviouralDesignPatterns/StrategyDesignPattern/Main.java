package DesignPatterns.BehaviouralDesignPatterns.StrategyDesignPattern;

public class Main {

    /*
    This design pattern is used to avoid duplicate of code as when interface is extended in multiple child classes its
    possible that some classes may have the same code for some actions. By using strategy in these child classes code
    duplicate is avoided !!!!
     */

    public static void main(String[] args) {
        NormalVehicle normalVehicle = new NormalVehicle();
        SportsVehicle sportsVehicle = new SportsVehicle();
        FastVehicle fastVehicle = new FastVehicle();

        normalVehicle.drive();

        sportsVehicle.drive();

        fastVehicle.drive();
    }
}
