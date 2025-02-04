package basics;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        String dirPath = "folder"+File.separator+"anotherFolder";
        File dir = new File(dirPath);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File file = new File(dirPath+ File.separator+  "myFile.txt");
       if(! file.exists()){
           file.createNewFile();
       }

       System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canWrite());

        FileWriter fw = new FileWriter(file);
        fw.write("First Line");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(file);
        int i;
        while((i= fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();

        FileOutputStream os = new FileOutputStream(file);
        String str = "My String";
        os.write(str.getBytes());
        os.flush();
        os.close();

        FileInputStream is = new FileInputStream(file);
        int j;
        while((j= is.read()) != -1){
            System.out.print((char)j);
        }
        fr.close();

        file.delete();

    }
}
/*File operations
---------------
Creation of a new file
Opening an existing file
Reading from file
Writing to a file
Closing a file
deleting a file

Java classes
------------
FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter,
FileOutputStream, etc.

- Create file
- read file properties
- read and write file using FileReader and FileWriter
- read and write file using FileInputStream and FileOutputStream
- use relative file path (File seperator) File separator is OS agnostic

*/