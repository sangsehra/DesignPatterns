package DesignPatterns.BehaviouralDesignPatterns.MementoDesignPattern;

import java.util.Stack;

public class ConfigurationCareTaker {

    Stack<ConfigurationMemento> configurationMementoHistory = new Stack<>();

    public void storeSnapShot(ConfigurationMemento configurationMemento){
        configurationMementoHistory.add(configurationMemento);
    }

    public ConfigurationMemento undo(){
        if (!configurationMementoHistory.empty()){
            return configurationMementoHistory.pop();
        } else {
           return new ConfigurationMemento(0,0);
        }
    }
}
