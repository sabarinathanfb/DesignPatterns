package DesignPattern.Decorator;

public class ChocolateSyrupDecorator extends IceCreamDecorator{
    public ChocolateSyrupDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",Chocolate Syrup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
