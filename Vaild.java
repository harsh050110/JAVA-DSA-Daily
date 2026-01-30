import java.util.*;
public class Vaild{
    public static void main(String[] args){
        Vaild v = new Vaild();
        String s ="A man, a plan, a canal:Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(v.isValid(s));
        System.out.println(v.isValid(s2));
        System.out.println(v.isValid(s3));
    }
    public boolean isValid(String s){
        int left =0;
        int right = s.length()-1;
        while(left<right){
            while(left< right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left< right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}