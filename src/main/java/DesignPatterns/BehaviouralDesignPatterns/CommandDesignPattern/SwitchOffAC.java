package DesignPatterns.BehaviouralDesignPatterns.CommandDesignPattern;

public class SwitchOffAC implements ICommand{

    AirConditioner ac;

    SwitchOffAC(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.switchOffAC();
    }

    @Override
    public void undo() {
        ac.switchOnAC();
    }
}
