package DesignPatterns.BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class InfoLogger extends Logger{

    Logger logger;
    InfoLogger(Logger logger){
        super(logger);
    }
    @Override
    public void log(int logLevel, String logMessage) {
        if (logLevel==INFO){
            System.out.println("INFO, "+logMessage);
            return;
        }
        super.log(logLevel,logMessage);
    }
}
