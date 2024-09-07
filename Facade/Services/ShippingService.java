package DesignPattern.Facade.Services;

public class ShippingService {
    public void shipProduct(String productID, String address) {
        System.out.println("Shipping product: " + productID + " to " + address);
    }
}
