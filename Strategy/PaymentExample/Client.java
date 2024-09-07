package DesignPattern.Strategy.PaymentExample;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentMethod(new Gpay());
        shoppingCart.checkout(200);
    }
}
