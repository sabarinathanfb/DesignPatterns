package DesignPattern.Decorator;

public abstract class IceCreamDecorator implements IceCream{


    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public double getCost() {
        return iceCream.getCost();
    }
}
