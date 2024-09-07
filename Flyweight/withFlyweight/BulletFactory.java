package DesignPattern.Flyweight.withFlyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private static Map<String, BulletFlyweight> bullets = new HashMap<>();

    public static BulletFlyweight getBullet(String type,int speed,int damage){

        String key = type + "-" + speed + "-" + damage;
        BulletFlyweight bullet = bullets.get(key);

        if(bullet == null){
            bullet = new BulletType(type,speed,damage);
            bullets.put(key,bullet);
        }
        return bullet;
    }

}
