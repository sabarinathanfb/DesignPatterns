package DesignPattern.Facade.WithoutFacade;

import DesignPattern.Facade.Services.InventoryService;
import DesignPattern.Facade.Services.PaymentService;
import DesignPattern.Facade.Services.ShippingService;

public class FlipkartWithoutFacade {
    public static void main(String[] args) {

        String productID = "P12345";
        String address = "123 Main Street, Bangalore";
        String paymentType = "Credit Card";
        double amount = 9999.99;

        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        if(inventoryService.checkStock(productID)){
            if(paymentService.processPayment(paymentType,amount)){

                inventoryService.updateStock(productID);
                shippingService.shipProduct(productID,address);
                System.out.println("Order placed successfully for product: " + productID);
            } else {
                System.out.println("Payment failed. Order not placed.");
            }
        } else {
            System.out.println("Product out of stock. Order not placed.");
        }



    }
}
