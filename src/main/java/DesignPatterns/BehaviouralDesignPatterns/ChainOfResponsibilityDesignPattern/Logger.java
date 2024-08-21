package DesignPatterns.BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern;

import java.util.Objects;

public abstract class Logger {
    public static int INFO =1;
    public static int DEBUG =2;

    public static int ERROR =3;

    public static int OTHER =4;

    Logger logger;
    Logger(Logger logger){
        this.logger=logger;
    }
    public void log(int loglevel ,String logMessage){
        if (Objects.nonNull(logger)){
            logger.log(loglevel,logMessage);
        } else {
            System.out.println("no implementation");
        }
    }
}
