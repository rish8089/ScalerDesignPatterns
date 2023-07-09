package RegistryPattern.Implementation;

public class Batch {
    String name;
    Batch(String name){
        this.name=name;
    }
    Batch(Batch b){
        this.name=b.name;
    }
}
