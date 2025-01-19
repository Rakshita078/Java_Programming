package interview.programs.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchingExample {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        String inputWord = bf.readLine();

        String[] wordList = {"apple","Banana","Pineapple","Orange","Kiwi"};

        boolean found = false;

        for(String word : wordList){
            if(word.equalsIgnoreCase(inputWord)){
                found =true;
                break;
            }
        }

        if (found){
            System.out.println("the word is present");
        } else {
            System.out.println("the word is absent");
        }

    }
}
