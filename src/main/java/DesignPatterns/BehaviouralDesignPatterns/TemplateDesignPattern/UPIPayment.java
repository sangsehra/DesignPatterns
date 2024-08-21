package DesignPatterns.BehaviouralDesignPatterns.TemplateDesignPattern;

public class UPIPayment extends PaymentFlow{
    @Override
    public void validatePaymentRequest() {
        System.out.println("request for UPI payment is validated");
    }

    @Override
    public void creditAmount() {
        System.out.println("amount is credited : 10");
    }

    @Override
    public void debitAmount() {
        System.out.println("amount is debited : 10");
    }

    @Override
    public void calculateTransactionFee() {
        System.out.println("transaction fee is 0");
    }
}
