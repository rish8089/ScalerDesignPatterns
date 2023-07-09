package PrototypeDesignPattern.Implementation4;
public class IntelligentStudent extends Student {
    int iq;
    IntelligentStudent(String name, int age, int iq){
        super(name,age);
        this.iq=iq;
    }
    IntelligentStudent(IntelligentStudent s2){
        super(s2);
        this.iq=s2.iq;
    }
    @Override
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
