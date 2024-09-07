package DesignPattern.Facade.WithFacade;

import DesignPattern.Facade.Services.InventoryService;
import DesignPattern.Facade.Services.PaymentService;
import DesignPattern.Facade.Services.ShippingService;

public class OrderServiceFacade {
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;

    public OrderServiceFacade() {
        paymentService = new PaymentService();
        inventoryService = new InventoryService();
        shippingService = new ShippingService();
    }

    public void placeOrder(String productID, String address, String paymentType, double amount) {
        System.out.println("Placing order for product: " + productID);

        // 1. Check inventory
        if (inventoryService.checkStock(productID)) {
            // 2. Process payment
            if (paymentService.processPayment(paymentType, amount)) {
                // 3. Update inventory and ship product
                inventoryService.updateStock(productID);
                shippingService.shipProduct(productID, address);
                System.out.println("Order placed successfully for product: " + productID);
            } else {
                System.out.println("Payment failed. Order not placed.");
            }
        } else {
            System.out.println("Product out of stock. Order not placed.");
        }
    }
}
