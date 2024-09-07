package DesignPattern.Observer.Services;

public class SMSService implements Service{
    @Override
    public void update(String orderID, String status) {
        if (status.equals("placed")) {
            System.out.println("SMSService: Sending SMS for order " + orderID + " placement.");
        } else if (status.equals("canceled")) {
            System.out.println("SMSService: Sending SMS for order " + orderID + " cancellation.");
        }
    }
}
