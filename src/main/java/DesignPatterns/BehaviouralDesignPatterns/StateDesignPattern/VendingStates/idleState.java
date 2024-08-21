package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Coin;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Product;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public class idleState implements VendingState {

    public idleState(){
        System.out.println("currently Vending Machine is in idele state");
    }
    @Override
    public void ClickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new MoneyDealingState());

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
        throw new Exception("no impl");
    }

    @Override
    public int getChange(int insertedMoney) {
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("no impl");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Product product, int productCode) throws Exception {
        throw new Exception("no impl");
    }
}
