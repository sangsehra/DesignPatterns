package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Coin;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Product;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public class ProductDispenseState implements VendingState{

    VendingMachine vendingMachine;
    int productCode;

    ProductDispenseState(VendingMachine vendingMachine, int productCode) throws Exception {
        this.vendingMachine=vendingMachine;
        this.productCode=productCode;
        dispenseProduct(productCode,vendingMachine);
    }

    @Override
    public void ClickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("no impl");
    }

    @Override
    public void insertCoin(Coin coin, VendingMachine vendingMachine) throws Exception {
        throw new Exception("no impl");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("no impl");
    }

    @Override
    public void chooseProduct(int productCode, VendingMachine vendingMachine) throws Exception {
      throw new Exception("no impl");
    }

    @Override
    public Product dispenseProduct(int productCode, VendingMachine vendingMachine) throws Exception {

        Product product = vendingMachine.dispenseProduct(productCode);

        System.out.println("dispensed :" +product.getProductType());

        return product;
    }

    @Override
    public int getChange(int insertedMoney) {
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("refund full money");
        return vendingMachine.coins;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Product product, int productCode) throws Exception {

    }
}
