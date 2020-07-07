package problem_solving.palindrome;

public class Main {
    public static void main(String[] args) {
        String value = "ABBA";
        String value2 = "ADDSAD";

        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindrome(value));
        System.out.println(palindrome.isPalindrome(value2));
    }
}
