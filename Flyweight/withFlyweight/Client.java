package DesignPattern.Flyweight.withFlyweight;

public class Client {
    public static void main(String[] args) {
        BulletFlyweight bullet = BulletFactory.getBullet("Pistol",300,25);
        bullet.fire(100,150,true);
    }
}
