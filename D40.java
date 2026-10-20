import java.util.*;

class Solution{
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int original = x;
        int reversed =0;
        while(x>0){
            int digit = x%10;
            reversed = reversed * 10 +digit;
            x=x/10;
        }
        return original == reversed;
    }
}
public class D40{
    public static void main(String[] args){
        Solution sol = new Solution();

        System.out.println(sol.isPalindrome(121));
        System.out.println(sol.isPalindrome(-121));
        System.out.println(sol.isPalindrome(10));
        System.out.println(sol.isPalindrome(0));
        
    }
}