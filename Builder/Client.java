package DesignPattern.Builder;

public class Client {

    public static void main(String[] args) {

        Student s = new Student.Builder().
                setRollno(213).
                setName("sabari").
                build();

        System.out.println(s);
    }
}
