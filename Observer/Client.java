package DesignPattern.Observer;

import DesignPattern.Observer.Order.FlipkartOrder;
import DesignPattern.Observer.Services.EmailService;
import DesignPattern.Observer.Services.InvoiceService;
import DesignPattern.Observer.Services.SMSService;

public class Client {
    public static void main(String[] args) {
        FlipkartOrder order = new FlipkartOrder("ORD12345");

        // Create services
        InvoiceService invoiceService = new InvoiceService();
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();

        // Add services as observers to the order
        order.addObserver(invoiceService);
        order.addObserver(smsService);
        order.addObserver(emailService);

        // Place order (all services will be notified)
        order.placeOrder();

        System.out.println("---------------");

        // Cancel order (all services will be notified)
        order.cancelOrder();
    }
}
