package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Coin;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Product;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public class MoneyDealingState implements VendingState{
    @Override
    public void ClickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("no impl");
    }

    @Override
    public void insertCoin(Coin coin, VendingMachine vendingMachine) {
        vendingMachine.insertMoney(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new ProductSelectionState());
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
    public int getChange(int insertedMoney) throws Exception {
        throw new Exception("no impl");
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
