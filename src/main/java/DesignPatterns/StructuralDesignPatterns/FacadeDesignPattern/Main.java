package DesignPatterns.StructuralDesignPatterns.FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
        here all the logic is in different classes but facade method has combined them and placed the order.
        So basically it's used to hide internal complex behaviour to perform task.
         */
        ProductOrderFacade order = new ProductOrderFacade(new Address(),new Invoice(), new Payments(),new Product());

        order.placeOrder();
    }
}
