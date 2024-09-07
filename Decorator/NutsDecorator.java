package DesignPattern.Decorator;

public class NutsDecorator extends IceCreamDecorator{
    public NutsDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Nuts";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.70;
    }
}
