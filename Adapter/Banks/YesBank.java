package DesignPattern.Adapter.Banks;

public class YesBank {
    public void sendPayment(int amount) {
        System.out.println("Yes Bank processing payment of " + amount);
    }
}
