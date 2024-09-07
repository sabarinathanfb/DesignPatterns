package DesignPattern.Facade.Services;

public class PaymentService {
    public boolean processPayment(String paymentType, double amount) {
        System.out.println("Processing payment of ₹" + amount + " using " + paymentType + "...");
        return true;
    }
}
