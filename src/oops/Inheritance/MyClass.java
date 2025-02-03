package oops.Inheritance;

import basics.AccessModifiers;

public class MyClass extends AccessModifiers {

    public static void main(String[] args){
        SubClass subClass = new SubClass("constructor string from myclass");
        subClass.superClassMethod();
        System.out.println(subClass.superStr);
        subClass.subClassMethod();
        subClass.printCommonString();
        subClass.printCommonMethod();
        myMethod1();
    }

}
