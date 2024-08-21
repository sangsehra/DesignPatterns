package DesignPatterns.BehaviouralDesignPatterns.InterpreterDesignPattern;

public interface InterpreterExpression {
    /*
    based on the requirement class method will be called
    also context(same) is passed across the interface so data will be same
     */
    int interpret(Context context);
}
