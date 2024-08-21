package DesignPatterns.BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class ErrorLogger extends Logger{
    Logger logger;

    ErrorLogger(Logger logger){
       super(logger);
    }

    @Override
    public void log(int loglevel, String logMessage) {
        if (loglevel==ERROR){
            System.out.println("ERROR, "+logMessage);
            return;
        }
        super.log(loglevel,logMessage);
    }
}
