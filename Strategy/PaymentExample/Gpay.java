package DesignPattern.Strategy.PaymentExample;

public class Gpay implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " "+"Payment Made through Gpay");
    }
}
