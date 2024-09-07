package DesignPattern.Decorator;

public class Client {
    public static void main(String[] args) {

        IceCream iceCream = new NutsDecorator(
                new ChocolateSyrupDecorator(
                        new SprinkleDecorator(
                                new BasicIceCream()
                        )
                )
        );

        System.out.println(iceCream.getDescription() + "- Cost: $" + iceCream.getCost());

    }
}
