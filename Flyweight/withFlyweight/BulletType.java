package DesignPattern.Flyweight.withFlyweight;

public class BulletType implements BulletFlyweight{
    private String type;   // Intrinsic state (shared)
    private int speed;     // Intrinsic state (shared)
    private int damage;    // Intrinsic state (shared)

    public BulletType(String type, int speed, int damage) {
        this.type = type;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public void fire(int positionX, int positionY, boolean isFired) {
        if (isFired) {
            System.out.println("Bullet of type '" + type + "' with speed " + speed +
                    " and damage " + damage + " fired at position (" +
                    positionX + ", " + positionY + ")");
        } else {
            System.out.println("Bullet of type '" + type + "' is not fired.");
        }
    }
}
