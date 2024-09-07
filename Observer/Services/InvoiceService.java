package DesignPattern.Observer.Services;

public class InvoiceService implements Service{
    @Override
    public void update(String orderID, String status) {
        if (status.equals("placed")) {
            System.out.println("InvoiceService: Generating invoice for order " + orderID);
        } else if (status.equals("canceled")) {
            System.out.println("InvoiceService: Canceling invoice for order " + orderID);
        }
    }
}
