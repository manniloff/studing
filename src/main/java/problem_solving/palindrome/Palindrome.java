package problem_solving.palindrome;

public class Palindrome {
    public boolean isPalindrome(String value){
        int i=0;
        int j = value.length() -1;

        while (i<j){
            if(value.charAt(i) != value.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
