package oops.Polymorphism;

public class Class1 {

//    Polymorphism: Ability of an object to take many forms!

//    How? By Overriding or Overloading methods.

//    Method Overriding
//-----------------
//- Allows a subclass to provide a specific implementation of a method that is already provided by its superclass
//- Method in subclass should have the same name, same signature, and same return type(or sub-type) as the method in its superclass

//    Method Overloading
//------------------
// - Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both

//    Polymorphism Types
//------------------
//- Runtime polymorphism or Dynamic method dispatch: Call resolved at runtime based on the type of the object being referred to at the time the call occurs
//    E.g. Method Overriding
//- Compile time polymorphism: Call resolved at compile time
//    E.g. Method Overloading

//   Notes
//-----
//- final methods cannot be overridden
//- Static methods cannot be overridden (method hiding)

    public static void main(String[] args){
        Employee employee = new FullTime();
        System.out.println("Full time employee salary is:"+employee.salary());
        FullTime f = new FullTime();
        f.myMethod(); //It's not overridden method so you cannot call with same object
        employee = new Contractor();
        System.out.println("Contractor employee salary is:"+employee.salary()); // Runtime polymorphism

        System.out.println(Employee.designation());
        System.out.println(Contractor.designation());
        System.out.println(FullTime.designation());

        OverloadingClass overloadingClass = new OverloadingClass();
        overloadingClass.myMethod("Hello");
        overloadingClass.myMethod(10);
        overloadingClass.myMethod("World",20);

    }

}
