package basics;

public class JavaBasics {

    //Fields - parameters - variables - int, float, double, boolean
    //constructors
    //methods

    int i = 1;
    static int j = 10;
    int k;
    int l;
    int m;
    static String n;

    public JavaBasics(){
        l= 28;
    }

    public JavaBasics(int m){
        this.m = m;
    }

    public static void main(String[] args){
        JavaBasics javaBasics = new JavaBasics(99);
        System.out.println(javaBasics.i); // since main method is static we have to create the object ta access non-static variable
        System.out.println(j);
        System.out.println(javaBasics.initializeVariable());
        System.out.println(javaBasics.l); // it's printing 0 since we are passing the arguments in the object creation
        System.out.println(javaBasics.m);
        staticMethod(); // since this method is static we no need to create the instance of the class to call the method
    }

    public int initializeVariable(){
        k = 6;
        return k;
    }

    public static void staticMethod(){
        n= "Hi";
        System.out.println(n);
    }
}
