package org.example;

public class FunctionInterface {

    public static void main(String[] args) {
        MyFuntionalInterface myFuntionalInterface = (a,b) -> System.out.println("object :"+a);
        myFuntionalInterface.myFunc(4,2);
        myFuntionalInterface.prints();
        MyFuntionalInterface.weew();
    }
}


interface MyFuntionalInterface {
    void myFunc(int a,int b);

    default void prints(){
        System.out.println("erere");
    }

    static void weew(){
        System.out.println("WEfewew");
    }

}