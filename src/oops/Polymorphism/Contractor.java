package oops.Polymorphism;

public class Contractor extends Employee{

    @Override
    int salary(){
        return base + 10000;
    }

    static String designation(){
        return "Contractor";
    }
}
