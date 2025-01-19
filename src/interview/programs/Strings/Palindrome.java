package interview.programs.Strings;

public class Palindrome {

    public static void main(String[] args){
        String s = "Racecar";
        //System.out.println(isPalindrome(s));
        System.out.println(isPalindromeWithoutReverseFunction(s));
    }

    public static boolean isPalindrome(String str){
        String s = str.toLowerCase();
        System.out.println(s);
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        System.out.println(rev);
        return s.contentEquals(rev);
    }

    public static boolean isPalindromeWithoutReverseFunction(String str){
        String s = str.toLowerCase();

        String rev = "";
        for(int i= s.length() -1; i>=0; i--){
          rev =  rev + s.charAt(i);
        }

        return s.equals(rev);
    }

}
