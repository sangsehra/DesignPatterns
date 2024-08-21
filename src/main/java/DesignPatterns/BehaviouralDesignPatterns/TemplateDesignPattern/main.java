package DesignPatterns.BehaviouralDesignPatterns.TemplateDesignPattern;

public class main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new CardPayment();

        paymentFlow.sendMoney();
    }
}
