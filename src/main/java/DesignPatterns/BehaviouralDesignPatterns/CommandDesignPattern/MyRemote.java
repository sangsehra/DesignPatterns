package DesignPatterns.BehaviouralDesignPatterns.CommandDesignPattern;

import java.util.Stack;

public class MyRemote {

    Stack<ICommand> commandHistory = new Stack<>();
    ICommand command;

    /*
      dont initialise command object from constructor otherwise for each command we need to create new object
     */

//    MyRemote(ICommand command){
//        this.command = command;
//    }

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
        commandHistory.push(this.command);
    }

    public void undo(){
        if (!commandHistory.empty()) {
            this.command = commandHistory.pop();
            command.undo();
        }
    }

}
