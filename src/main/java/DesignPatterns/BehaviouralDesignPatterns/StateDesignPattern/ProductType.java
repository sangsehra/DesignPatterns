package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern;

public enum ProductType {
    PEPSI(101),
    COKE(102),
    SODA(103),
    WATER(104);

    int productCode;
    ProductType(int productCode) {
        this.productCode=productCode;
    }
}
