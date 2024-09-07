package DesignPattern.Singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

    public volatile static Singleton uniqueObject;

    private Singleton(){

        /* Avoiding Object Creation Using Reflection */
        if (uniqueObject !=null){
            throw new RuntimeException("Use getInstance() method to create Object ");
        }
    }

    public static Singleton getInstance(){

        if(uniqueObject == null){
            synchronized (Singleton.class){
                if(uniqueObject == null){
                    uniqueObject =  new Singleton();
                }

            }

        }
        return uniqueObject;

    }

    //Avoid Object Creation Using Serialization/Deserialization
    protected Object readResolve() {
        return new Singleton();
    }


    // Avoiding Object Creation Using Clone Method
    @Override
    protected Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone Not Supported");
    }
}
