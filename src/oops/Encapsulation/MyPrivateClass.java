package oops.Encapsulation;

public class MyPrivateClass {

//Encapsulation: wrapping up of data under a single unit! The data is protected!

//    How?
//- By making class attributes (or variables) private
//- By making methods as private

//Use getter and setter methods to access private attributes

//  Advantages
//----------
//- Data hiding
//- Flexibility to use variable as read only or write only
//- Reusability


    private String str = "Hello";
    private int i = 89;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private void privateMethod(){
        System.out.println("Private method");
    }
}
