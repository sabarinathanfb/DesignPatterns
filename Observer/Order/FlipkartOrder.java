package DesignPattern.Observer.Order;

import DesignPattern.Observer.Services.Service;

import java.util.ArrayList;
import java.util.List;

public class FlipkartOrder implements Order{
    private List<Service> services = new ArrayList<>();
    private String orderID;

    public FlipkartOrder(String orderID) {
        this.orderID = orderID;
    }

    @Override
    public void addObserver(Service service) {
        services.add(service);
    }

    @Override
    public void removeObserver(Service service) {
        services.remove(service);
    }

    @Override
    public void notifyObservers(String status) {
        for (Service service : services) {
            service.update(orderID, status);
        }
    }

    // Simulate placing an order
    public void placeOrder() {
        System.out.println("Order " + orderID + " has been placed.");
        notifyObservers("placed");
    }

    // Simulate canceling an order
    public void cancelOrder() {
        System.out.println("Order " + orderID + " has been canceled.");
        notifyObservers("canceled");
    }
}
