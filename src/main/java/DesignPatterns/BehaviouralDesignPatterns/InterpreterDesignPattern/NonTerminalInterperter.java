package DesignPatterns.BehaviouralDesignPatterns.InterpreterDesignPattern;

public class NonTerminalInterperter implements InterpreterExpression{

    InterpreterExpression leftTerminalInterpreter;
    InterpreterExpression rightTerminalInterpreter;

    NonTerminalInterperter(InterpreterExpression leftTerminalInterpreter,InterpreterExpression rightTerminalInterpreter){
        this.leftTerminalInterpreter = leftTerminalInterpreter;
        this.rightTerminalInterpreter=rightTerminalInterpreter;
    }

    @Override
    public int interpret(Context context) {
        /*
        here left and right objects are terminal objects passed from main class so only terminal interpret method will
        be called;
         */
        return leftTerminalInterpreter.interpret(context) * rightTerminalInterpreter.interpret(context);
    }
}
