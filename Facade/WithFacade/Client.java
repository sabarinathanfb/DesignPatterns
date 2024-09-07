package DesignPattern.Facade.WithFacade;

public class Client {
    public static void main(String[] args) {
        OrderServiceFacade orderService = new OrderServiceFacade();

        // Place an order
        orderService.placeOrder("P12345", "123 Main Street, Bangalore", "Credit Card", 9999.99);

    }
}
