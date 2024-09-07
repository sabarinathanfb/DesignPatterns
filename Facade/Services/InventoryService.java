package DesignPattern.Facade.Services;

public class InventoryService {
    public boolean checkStock(String productID) {
        System.out.println("Checking stock for product: " + productID);
        return true;  // Assume product is in stock
    }

    public void updateStock(String productID) {
        System.out.println("Stock updated for product: " + productID);
    }
}
