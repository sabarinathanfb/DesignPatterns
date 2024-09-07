package DesignPattern.Observer.Services;

public class EmailService implements Service{
    @Override
    public void update(String orderID, String status) {
        if (status.equals("placed")) {
            System.out.println("EmailService: Sending email for order " + orderID + " placement.");
        } else if (status.equals("canceled")) {
            System.out.println("EmailService: Sending email for order " + orderID + " cancellation.");
        }
    }
}
