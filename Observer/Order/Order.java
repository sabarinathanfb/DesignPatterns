package DesignPattern.Observer.Order;

import DesignPattern.Observer.Services.Service;

public interface Order {
    void addObserver(Service service);
    void removeObserver(Service service);
    void notifyObservers(String status);
}
