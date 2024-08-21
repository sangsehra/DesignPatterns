package DesignPatterns.BehaviouralDesignPatterns.TemplateDesignPattern;

public class CardPayment extends PaymentFlow{
    @Override
    public void validatePaymentRequest() {
        System.out.println("request for CARD payment is validated");
    }

    @Override
    public void creditAmount() {
        System.out.println("amount is credited : 1000");
    }

    @Override
    public void debitAmount() {
        System.out.println("amount is debited : 111");
    }

    @Override
    public void calculateTransactionFee() {
        System.out.println("transaction fee is 2");
    }
}
