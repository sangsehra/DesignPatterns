package DesignPatterns.BehaviouralDesignPatterns.InterpreterDesignPattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a",5);
        context.put("b",10);

        InterpreterExpression interpreterExpression = new NonTerminalInterperter(new TerminalInterpreter("a"),new TerminalInterpreter("b"));

        System.out.println(interpreterExpression.interpret(context));
    }
}
