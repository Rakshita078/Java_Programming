package oops.Encapsulation;

public class MyClass {

    public static void main(String[] args){
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.setStr("Encapsulated string");
        System.out.println(myPrivateClass.getI());
        System.out.println(myPrivateClass.getStr());
    }
}
