package DesignPattern.Decorator;

public class SprinkleDecorator extends IceCreamDecorator{
    public SprinkleDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "," +"Sprinkles";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.30;
    }
}
