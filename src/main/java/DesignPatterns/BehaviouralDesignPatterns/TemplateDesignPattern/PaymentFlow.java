package DesignPatterns.BehaviouralDesignPatterns.TemplateDesignPattern;

public abstract class PaymentFlow {

    public abstract void validatePaymentRequest();

    public abstract void creditAmount();

    public abstract void debitAmount();

    public abstract void calculateTransactionFee();

    /*
    this is the template method which is private so none of the sub-classes can override
    and has to follow these steps but they can have their own implementation
     */
    public final void sendMoney(){
        validatePaymentRequest();

        calculateTransactionFee();

        creditAmount();

        debitAmount();
    }

}
