package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern;

import DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern.VendingStates.VendingState;

public class Main {

    public static void main(String[] args) throws Exception {
        // here initial idle state is set
        // while initializing inventory default inventory is set
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.printInventory();
            // here money dealing state is set
            VendingState vendingState = vendingMachine.getVendingMachineState();
            vendingState.ClickOnInsertCoinButton(vendingMachine);


            vendingState= vendingMachine.getVendingMachineState();
            vendingState.insertCoin(Coin.ten,vendingMachine);
            vendingState.insertCoin(Coin.five,vendingMachine);

            // here productSelection state is set
            vendingState.clickOnStartProductSelectionButton(vendingMachine);
            vendingState = vendingMachine.getVendingMachineState();
            // inside the flow product dispense state is set and dispensed
            vendingState.chooseProduct(101,vendingMachine);
            vendingMachine.printInventory();
            vendingState.chooseProduct(101,vendingMachine);
            vendingMachine.printInventory();

    }
}
