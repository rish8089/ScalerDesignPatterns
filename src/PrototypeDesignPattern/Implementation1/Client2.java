package PrototypeDesignPattern.Implementation1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        Student s1=getStudent(input);
        Student s2;
        if(s1 instanceof IntelligentStudent){
            IntelligentStudent ist=(IntelligentStudent) s1;
            s2=new IntelligentStudent(s1.name,s1.age,ist.iq);
            s2.b=new Batch(s1.b.name);
        }else {
            s2=new Student(s1.name,s1.age);
            s2.b=new Batch(s1.b.name);
        }
    }
    private static Student getStudent(int input){
        switch (input%2){
            case 0:
                Student s = new Student("Rishab",20);
                s.b=new Batch("august 22 intermediate");
                return s;
            case 1:
                IntelligentStudent is=new IntelligentStudent("Rishab",20,99);
                is.b=new Batch("august 22 intermediate");
                return is;
        }
        return null;
    }
}
