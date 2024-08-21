package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Coin;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.Product;
import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public class ProductSelectionState implements VendingState{
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
        if(vendingMachine.isProductAvailable(productCode)){
           vendingMachine.setVendingMachineState(new ProductDispenseState(vendingMachine,productCode));
        } else {
            System.out.println("product not available");;
            refundFullMoney(vendingMachine);
        }
    }

    @Override
    public Product dispenseProduct(int productCode, VendingMachine vendingMachine) throws Exception {
        throw new Exception("no impl");
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        System.out.println("returned extra money : "+changeMoney);
        return changeMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("full money refunded :" +vendingMachine.coins);
        vendingMachine.setVendingMachineState(new idleState());
        return vendingMachine.coins;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Product product, int productCode) throws Exception {

    }
}
