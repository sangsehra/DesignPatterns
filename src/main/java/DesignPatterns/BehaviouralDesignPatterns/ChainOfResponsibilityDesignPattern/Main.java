package DesignPatterns.BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
         control is in parent class for how to call next class method
         */
        Logger logger = new DebugLogger(new ErrorLogger(new InfoLogger(null)));

        logger.log(Logger.INFO,"this is info");
        logger.log(Logger.OTHER,"this is other");
    }
}
