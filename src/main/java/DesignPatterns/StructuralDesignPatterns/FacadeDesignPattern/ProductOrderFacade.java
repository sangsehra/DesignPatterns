package DesignPatterns.StructuralDesignPatterns.FacadeDesignPattern;

public class ProductOrderFacade {
    private Address address;
    private Invoice invoice;
    private Payments payments;
    private Product product;

    public ProductOrderFacade(Address address, Invoice invoice, Payments payments, Product product) {
        this.address = address;
        this.invoice = invoice;
        this.payments = payments;
        this.product = product;
    }


    void placeOrder(){
        product.addToCart();
        address.addAddress();
        payments.doPayment();
        invoice.createInvoice();
    }

}
