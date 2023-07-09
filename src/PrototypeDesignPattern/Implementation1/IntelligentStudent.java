package PrototypeDesignPattern.Implementation1;

public class IntelligentStudent extends Student {
    int iq;
    IntelligentStudent(String name, int age, int iq){
        super(name,age);
        this.iq=iq;
    }
}
