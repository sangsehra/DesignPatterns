package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates.ProductSelectionState;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates.VendingState;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates.idleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    public List<Coin> coins;
    int totalMoney =0;
    VendingState vendingMachineState;

    Inventory inventory;

    VendingMachine(){
        coins= new ArrayList<>();
        vendingMachineState = new idleState();
        inventory = new Inventory(4);
    }

    public void setVendingMachineState(VendingState state){
        vendingMachineState = state;
    }

    public VendingState getVendingMachineState() {
        return vendingMachineState;
    }

    public void insertMoney(Coin coin){
        coins.add(coin);
        totalMoney += coin.value;
    }

    public boolean isProductAvailable(int productCode){
       return inventory.isProductAvailable(productCode);
    }

    public Product dispenseProduct(int productCode) throws Exception {
        int productPrice = inventory.getProductPrice(productCode);

        if(totalMoney<productPrice){
            vendingMachineState.refundFullMoney(this);
            return new Product();
        } else{
            Product product = inventory.updateAvailability(productCode);
            System.out.println("dispensing product :"+product.getProductType());
            if (totalMoney>productPrice){
                this.setVendingMachineState(new ProductSelectionState());
                vendingMachineState.getChange(totalMoney-productPrice);
            }
            return product;
        }
    }

    public void printInventory(){
        System.out.println();
        System.out.println();
        System.out.println("##### INVENTORY #####");
       for(Product product : inventory.productList){
           System.out.println("productType :"+product.getProductType()+", product price :"+product.getPrice()+" Rs."+", productAvailable : "+(product.isAvailable?"YES":"NO"));
       }
        System.out.println();
    }
}
