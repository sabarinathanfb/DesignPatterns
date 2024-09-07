package DesignPattern.Flyweight.withoutFlyweight;

// Bullet class (no shared state)
class Bullet {
    private String type;    // Intrinsic state (not shared)
    private int speed;      // Intrinsic state (not shared)
    private int damage;     // Intrinsic state (not shared)
    private int positionX;  // Extrinsic state
    private int positionY;  // Extrinsic state
    private boolean isFired; // Extrinsic state

    public Bullet(String type, int speed, int damage, int positionX, int positionY, boolean isFired) {
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isFired = isFired;
    }

    public void fire() {
        if (isFired) {
            System.out.println("Bullet of type '" + type + "' with speed " + speed +
                    " and damage " + damage + " fired at position (" +
                    positionX + ", " + positionY + ")");
        } else {
            System.out.println("Bullet of type '" + type + "' is not fired.");
        }
    }
}


