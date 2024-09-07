package DesignPattern.Decorator;

public class BasicIceCream implements IceCream{
    @Override
    public String getDescription() {
        return "Basic IceCream";
    }

    @Override
    public double getCost() {
        return 1.50;
    }
}
