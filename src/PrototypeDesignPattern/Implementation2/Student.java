package PrototypeDesignPattern.Implementation2;
public class Student {
    String name;
    int age;
    Batch b;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
        this.b=new Batch(s1.b);
    }
}
