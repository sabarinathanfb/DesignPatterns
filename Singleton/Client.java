package DesignPattern.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


            Singleton instance1 = Singleton.getInstance();

            try {

                Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
                constructor.setAccessible(true); // Breaks the private access modifier
                Singleton instance2 = constructor.newInstance();
            }catch (Exception e){
                System.out.println("Cant Create object");
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // Deserialize the Singleton instance
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton instance3 = (Singleton) in.readObject();
            in.close();

            System.out.println("Instance 1 hashcode: " + instance1.hashCode()) ;
            System.out.println("Instance 1 hashcode: " + instance3.hashCode()) ;



    }
}
