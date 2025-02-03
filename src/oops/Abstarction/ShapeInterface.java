package oops.Abstarction;

public interface ShapeInterface {
    int i = 5;
    String color();
    double area();
    String info();

    default void defaultMethod(){
        System.out.println("default method");
    }

    static void staticMethod(){
        System.out.println("static method");
    }
}

//Abstraction: Hide details and show only essential information!

//Interface
//--------------
//Provides complete abstraction (blueprint! - what to do and not how to do!)
//Methods are by default abstract and public
//Attributes are by default public, static and final. In other words, attributes are constants
//Cannot contain constructor
//Must be implemented by other class using implements keyword
//Sub class must implement all abstract methods
//Sub class can implement multiple interfaces
//Java8: Can have default method
//Java8: Can have static method


//Adv
//---
//Reduces complexity by hiding implementation
//Increases security by providing only important details to the user
//Helps achieve multiple inheritance
