package PrototypeDesignPattern.Implementation3;

public class IntelligentStudent extends Student{
    int iq;
    IntelligentStudent(String name, int age, int iq){
        super(name,age);
        this.iq=iq;
    }
    @Override
    public IntelligentStudent copy(){
        IntelligentStudent is=new IntelligentStudent(this.name,this.age,this.iq);
        this.b=new Batch(this.b);
        return is;
    }
}
