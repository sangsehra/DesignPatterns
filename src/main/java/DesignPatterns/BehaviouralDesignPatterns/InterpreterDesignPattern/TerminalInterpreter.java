package DesignPatterns.BehaviouralDesignPatterns.InterpreterDesignPattern;

public class TerminalInterpreter implements InterpreterExpression{

    String stringValue;

    TerminalInterpreter(String stringValue){
        this.stringValue=stringValue;
    }

    @Override
    public int interpret(Context context) {
       return context.get(stringValue);
    }
}
