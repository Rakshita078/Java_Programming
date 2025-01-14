package basics;

import static basics.JavaBasics.staticMethod;

public class JavaBasics2 {

    int i;
    static int j;
    static final int k = 5;
    final int l;

    public JavaBasics2(){
        l = 10; // another way of initializing final variable
    }

    public static void main(String[] args){
        JavaBasics2 javaBasics2 = new JavaBasics2();
        javaBasics2.initialize();
        JavaBasics2 javaBasics3 = new JavaBasics2();
        System.out.println(javaBasics3.i); // this will print 0 and not 2 because we have created 2 instance of the class and
        // the value will reset when we create the second instance of the class ( this happens because the method and variable is on static)
        // this results in lot of null pointer exception

        // In case of static since we don't need to create any instance of the class the initialized value will not be changed
       staticFunction();
       System.out.println(k);
       System.out.println(javaBasics3.l);
       System.out.println(EnumConstants.MONDAY);
       staticMethod(); // Call static method from different class
        JavaBasics javaBasics = new JavaBasics();
        System.out.println(javaBasics.initializeVariable()); // Call non static method from different class
    }

    public void initialize(){
        i=2;
    }

    public static void staticFunction(){
        j = 2;
        System.out.println(j);
    }
}
