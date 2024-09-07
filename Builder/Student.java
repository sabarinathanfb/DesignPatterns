package DesignPattern.Builder;

public class Student {

    private String name;
    private int rollno;

    // Private constructor to enforce object creation through the builder
    private Student(Builder builder) {
        this.name = builder.name;
        this.rollno = builder.rollno;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    // Static inner Builder class
    public static class Builder {
        private String name;
        private int rollno;

        // Setter methods in the Builder class should return Builder itself
        public Builder setName(String name) {
            this.name = name;
            return this;  // Returning 'this' allows method chaining
        }

        public Builder setRollno(int rollno) {
            this.rollno = rollno;
            return this;  // Returning 'this' allows method chaining
        }

        // The build() method returns a new Student object
        public Student build() {
            return new Student(this);  // Pass the builder itself to the private constructor
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}

