package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Coin;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Product;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public interface VendingState {

    public void ClickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(Coin coin, VendingMachine vendingMachine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    public void chooseProduct(int productCode, VendingMachine vendingMachine) throws Exception;

    public Product dispenseProduct(int productCode, VendingMachine vendingMachine) throws Exception;

    public int getChange(int insertedMoney) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    public void updateInventory(VendingMachine vendingMachine, Product product, int productCode) throws Exception;

}
