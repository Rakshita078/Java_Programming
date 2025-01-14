package interview.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First String");
        String str1 = bufferedReader.readLine();
        System.out.println("Enter the Second String");
        String str2 = bufferedReader.readLine();

        if (anagramFunction(str1,str2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }

    public static boolean anagramFunction(String str1, String str2){
        String s1 = str1.replaceAll("[^a-zA-Z]","").replaceAll("\\s","").toLowerCase().trim();
        String s2 = str2.replaceAll("[^a-zA-Z]","").replaceAll("\\s","").toLowerCase().trim();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
