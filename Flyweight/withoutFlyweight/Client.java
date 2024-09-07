package DesignPattern.Flyweight.withoutFlyweight;

public class Client {
    public static void main(String[] args) {
        Bullet bullet1 = new Bullet("Pistol",300,25,100,150,true);
        bullet1.fire();

        Bullet bullet2 = new Bullet("Pistol", 300, 25, 200, 250, true);
        bullet2.fire();  // Another pistol bullet with same type but new instance

        Bullet bullet3 = new Bullet("Rifle", 600, 50, 300, 350, false);
        bullet3.fire();  // Rifle bullet with its own state
    }
}
