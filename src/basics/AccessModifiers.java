package basics;

public class AccessModifiers {
//    Access modifiers: public, protected, private, default
//    Def
//    public: Everywhere
//    protected: by class in same package or by sub class if outside package
//    private: Within class
//    default: by class in same package

//    Applicability
//-------------
//    Class: public, default
//    Attributes and methods: public, private, protected, default

//    Notes
//-----
//- Use private for attributes unless there is a good reason not to do so
//- Use public for constants
//- Use protected if you want class members to be accessed by sub classes or by classes in the same package
//- Use private if you think the method will be accessed only within the class

     String str = "my String";
     private String str1 = "Private string";
     protected String str2 = "protected string";

     void myMethod(){
        System.out.println("Access modifiers");
    }

    protected static void myMethod1(){
        System.out.println("protected method");
    }
}
