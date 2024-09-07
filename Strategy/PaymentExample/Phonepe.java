package DesignPattern.Strategy.PaymentExample;

public class Phonepe implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " " + "Payment Made Through Phonepe");
    }
}
