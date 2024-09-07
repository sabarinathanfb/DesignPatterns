package DesignPattern.Adapter.Banks;

public class ICICIBank {
    public void makeTransaction(int amount) {
        System.out.println("ICICI Bank processing payment of " + amount);
    }
}
