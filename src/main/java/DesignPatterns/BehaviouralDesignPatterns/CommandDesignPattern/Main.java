package DesignPatterns.BehaviouralDesignPatterns.CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        MyRemote myRemote = new MyRemote();

        myRemote.setCommand(new SwitchOnAC(new AirConditioner()));

        myRemote.executeCommand();

        myRemote.setCommand(new SwitchOffAC(new AirConditioner()));

        myRemote.executeCommand();


        myRemote.undo();
    }
}
