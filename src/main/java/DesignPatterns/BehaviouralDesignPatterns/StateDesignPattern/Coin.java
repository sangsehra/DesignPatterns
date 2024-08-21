package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern;

public enum Coin {
    five(5),
    ten(10),
    fifteen(15),

    twenty(20);

    int value;
    Coin(int value) {
        this.value=value;
    }
}
