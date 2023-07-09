package RegistryPattern.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StudentRegistry studentRegistry=new StudentRegistry();
        registerStudents(studentRegistry);
        int input=Integer.parseInt(br.readLine());
        Student s1=studentRegistry.get(String.valueOf(input%2));
        Student s2=s1.copy();
    }
    private static void registerStudents(StudentRegistry studentRegistry){
        Student s = new Student("Rishab",20);
        s.b=new Batch("august 22 intermediate");
        studentRegistry.register("0",s);

        IntelligentStudent is=new IntelligentStudent("Rishab",20,99);
        is.b=new Batch("august 22 intermediate");
        studentRegistry.register("1",is);
    }
}
