package DesignPatterns.BehaviouralDesignPatterns.CommandDesignPattern;

public class SwitchOnAC implements ICommand{
    AirConditioner ac;

    SwitchOnAC(AirConditioner ac){
        this.ac =ac;
    }

    @Override
    public void execute() {
        ac.switchOnAC();
    }

    @Override
    public void undo() {
        ac.switchOffAC();
    }
}
