package oops.Inheritance;

public class MyClass {

    public static void main(String[] args){
        SubClass subClass = new SubClass("constructor string from myclass");
        subClass.superClassMethod();
        System.out.println(subClass.superStr);
        subClass.subClassMethod();
        subClass.printCommonString();
        subClass.printCommonMethod();
    }
}
