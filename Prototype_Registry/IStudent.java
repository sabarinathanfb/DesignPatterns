package DesignPattern.Prototype_Registry;

public class IStudent extends Student{

    private int iq ;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IStudent(){

    }

    public IStudent(IStudent other){
        super(other);
        this.iq = other.iq;

    }

    @Override
    public IStudent copy(){

        return new IStudent(this);

    }
}
