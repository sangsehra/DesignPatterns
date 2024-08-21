package DesignPatterns.BehaviouralDesignPatterns.CommandDesignPattern;

public class AirConditioner {

    boolean isON;

    public void switchOnAC(){
        isON=true;
        System.out.println("AC turned on");
    }

    public void  switchOffAC(){
        isON=false;
        System.out.println("AC turned off");
    }
}
