package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        File file = new File("c://myfile.txt");
        FileReader fr = null;
        try {
               fr  = new FileReader(file);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
           //throw e;
        }finally {
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("After exception");
//        int myArray[] = {1,2,3};
//        System.out.println(myArray[3]); // Runtime exception

    }

    public void runTimeExceptionWthResourceBlock(){
        File file = new File("c://myfile.txt");
        try (FileReader fr = new FileReader(file)) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("After exception");
    }

    public static void userDefinedException() throws FileNotFoundException{
        File file = new File("c://myfile.txt");
        try {
           System.out.println("random");
            throw new JavaBasics2();
        } catch (JavaBasics2 e) {
            e.printException();
            e.printStackTrace();
        }
        System.out.println("After exception");
    }

}

//Exception types
//================
//Compile time exception (checked exceptions)
//Runtime exception (unchecked exception)

//Ways to handle exceptions
//=========================
//Handling exception using try catch finally
//throws keyword: postpone exception
//try with resources
//user defined exception
//throw new Exception


