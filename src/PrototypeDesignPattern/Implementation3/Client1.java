package PrototypeDesignPattern.Implementation3;

public class Client1 {
    public static void main(String[] args) {
        Student s1=new Student("Rishab",20);
        s1.b=new Batch("August 22 Intermediate batch");
        Student s2=s1.copy();
    }
}
