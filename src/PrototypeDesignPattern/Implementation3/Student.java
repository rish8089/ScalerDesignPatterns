package PrototypeDesignPattern.Implementation3;

public class Student {
    String name;
    int age;
    Batch b;
    private int counter;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        counter++;
        return age;
    }
    public Student copy(){
        Student s=new Student(this.name,this.age);
        s.b=new Batch(this.b);
        return s;
    }
}
