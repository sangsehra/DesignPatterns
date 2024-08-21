package DesignPatterns.BehaviouralDesignPatterns.InterpreterDesignPattern;

import java.util.HashMap;

public class Context {

    HashMap<String,Integer> contextMap = new HashMap<>();

    public void put(String ch, Integer value){
        contextMap.put(ch,value);
    }

    public Integer get(String ch){
        return contextMap.get(ch);
    }
}
