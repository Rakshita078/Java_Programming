package interview.programs.Strings;

public class ReverseString {

    public static void main(String[] args){
        String s = "Rakshita";
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        System.out.println(rev);
    }
}
