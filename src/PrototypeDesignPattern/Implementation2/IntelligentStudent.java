package PrototypeDesignPattern.Implementation2;
public class IntelligentStudent extends Student {
    int iq;
    IntelligentStudent(String name, int age, int iq){
        super(name,age);
        this.iq=iq;
    }
    IntelligentStudent(IntelligentStudent is1){
        super(is1.name,is1.age);
        this.iq=is1.iq;
    }
}

