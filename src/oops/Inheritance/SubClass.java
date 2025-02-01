package oops.Inheritance;

public class SubClass extends SuperClass{

    String commonStr = "Sub common string";

    public SubClass(String str){
        super(str); //invoking parameterized constructor of super class
        System.out.println("Sub class constructor");
    }

    public void subClassMethod(){
        System.out.println("Sub class methods");
    }

    public void printCommonString(){
        System.out.println(commonStr);
        System.out.println(super.commonStr);
    }

    public void commonMethod(){
        System.out.println("sub common method");
    }

    public void printCommonMethod(){
      commonMethod();
      super.commonMethod();
    }
}
