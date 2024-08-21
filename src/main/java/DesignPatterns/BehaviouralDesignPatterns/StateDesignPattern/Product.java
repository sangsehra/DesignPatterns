package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern;

public class Product {
    ProductType productType;
    int price;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    boolean isAvailable;

    Product(ProductType productType, int price){
        this.productType = productType;
        this.price=price;
        this.isAvailable=true;
    }

    Product(){

    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
