import java.util.*;
public class Ques{
    public static void main(String[] args){
        Ques q = new Ques();
        String s= "Hello,World!";
        String s1="Java124";
        String s2="$$$$";
        System.out.println(q.ques(s));
        System.out.println(q.ques(s1));
        System.out.println(q.ques(s2));
    }
    public int ques(String s){
        int left =0;
        int right = s.length()-1;
        int count =0;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}