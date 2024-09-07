package DesignPattern.Prototype_Registry;

public class Client {
    public static void main(String[] args) {

        StudentRegistry sr = new StudentRegistry();


        Student st = new IStudent();
        st.setName("sabari");
        st.setRollno(37);
        ((IStudent)st).setIq(200);

        sr.setMap("sabri",st);




        Student copy = st.copy();

        System.out.println(st.hashCode());
        System.out.println(copy.hashCode());

        Student reg1 = sr.getMap("sabri").copy();

        System.out.println(reg1.hashCode());
    }
}
