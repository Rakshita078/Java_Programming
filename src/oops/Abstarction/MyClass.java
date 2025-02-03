package oops.Abstarction;

public class MyClass {

//    Abstraction: Hide details and show only essential information!

//    Abstract class
//--------------
//    Provides partial abstraction
//    Abstract method is declared without implementation
//    Abstract class cannot be directly instantiated
//    Sub class can access Abstract class using extends keyword
//    Sub class must implement all abstract methods i.e. Overriding is compulsory
//    Abstract class can have parameterized constructor

//    Adv
//---
//    Reduces complexity by hiding implementation
//    Better viewing
//    Avoids code duplication and promotes reusability
//    Increases security by providing only important details to the user

//    E.g.
//----
//    Shapes: Abstract
//    Triangle: SubClass1
//    Square: SubClass2


    public static void main(String[] args){
        Circle circle = new Circle("Red",5.0);
        System.out.println(circle.info());

        Square square = new Square("blue", 2);
        System.out.println(square.info());

        CircleInterfaceExample circleInterfaceExample = new CircleInterfaceExample("Green",10);
       System.out.println( circleInterfaceExample.info());

       SquareInterfaceExample squareInterfaceExample = new SquareInterfaceExample("Purple",6);
        System.out.println( squareInterfaceExample.info());
        ShapeInterface.staticMethod();
        System.out.println(ShapeInterface.i);
    }
}
