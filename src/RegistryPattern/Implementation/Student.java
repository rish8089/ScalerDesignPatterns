package RegistryPattern.Implementation;

public class Student implements Cloneable<Student> {
    String name;
    int age;
    Batch b;
    private int counter;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s2){
        this(s2.name,s2.age);
        this.b=new Batch(s2.b);
        this.counter=s2.counter;
    }
    public long getAge(){
        counter++;
        return age;
    }
    @Override
    public Student copy() {
        return new Student(this);
    }
}
