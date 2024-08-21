package DesignPatterns.BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class DebugLogger extends Logger{

    Logger logger;
    DebugLogger(Logger logger){
        super(logger);
    }

    @Override
    public void log(int loglevel, String logMessage) {
        if (loglevel==DEBUG){
            System.out.println("DEBUG, "+logMessage);
            return;
        }
        super.log(loglevel,logMessage);
    }
}
