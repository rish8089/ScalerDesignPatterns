package PrototypeDesignPattern.Implementation4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        Student s1=getStudent(input);
        Student s2=s1.copy();
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
