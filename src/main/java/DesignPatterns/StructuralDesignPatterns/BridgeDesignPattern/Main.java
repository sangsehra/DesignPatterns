package DesignPatterns.StructuralDesignPatterns.BridgeDesignPattern;

public class Main {

    /*
    This design pattern is used to avoid duplicate of code as when interface is extended in multiple child classes its
    possible that some classes may have the same code for some actions. By using strategy in these child classes code
    duplicate is avoided,  main thing is decoupling now n numnber of vehicles can be implemented without worrying about
    drive type . !!!!!

    its kind of similar to strategy design pattern but strategy design pattern will have single client where here can be multiple
    implemented clients like vehicles. more of intent difference is there.
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
