import java.util.*;
public class Vaild2 {

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));   
        System.out.println(validPalindrome("abca"));  
        System.out.println(validPalindrome("abc"));   
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

   
    public static boolean isPalindrome(String s, int L, int R) {
        while (L < R) {
            if (s.charAt(L) != s.charAt(R)) {
                return false;
            }
            L++;
            R--;
        }
        return true;
    }
}
