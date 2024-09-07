package DesignPattern.Strategy.PaymentExample;

public class ShoppingCart {

    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void checkout(int amount){
        paymentMethod.pay(amount);
    }
}
