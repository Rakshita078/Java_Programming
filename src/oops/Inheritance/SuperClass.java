package oops.Inheritance;

public class SuperClass {

    //Inheritance is used for reusability and uses the extends keyword
    //subclass - derived class or child class
    //superclass - base class or parent class

//    Important points
//----------------
// - Subclass can have it's own methods and fields in addition to Superclass's methods and fields
//- Subclass can have only one Superclass. In other words, multiple inheritance is not supported
//- Subclass cannot inherit Superclass's constructor, but it can invoke the constructor

//    Types
//    Single inheritance
//    Multilevel inheritance
//    Hierarchical inheritance
//    Multiple inheritance (using interface)

//super keyword
//-------------
//- Used to differentiate members of Superclass from members of Subclass, if they have same names
//- Used to invoke the constructor of Superclass from Subclass

    public SuperClass(String str){
        System.out.println("Super class constructor");
        System.out.println(str);
    }

    String superStr = "Super class string";
    String commonStr = "Super common string";

    public void superClassMethod(){
        System.out.println("super class method");
    }

    public void commonMethod(){
        System.out.println("super common method");
    }

}
