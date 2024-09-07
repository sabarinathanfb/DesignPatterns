package DesignPattern.Prototype_Registry;

public class Student {

    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student(){

    }

    public Student(Student other){
        this.name = other.name;
        this.rollno = other.rollno;


    }

    public Student copy(){

        return new Student(this);
    }
}
