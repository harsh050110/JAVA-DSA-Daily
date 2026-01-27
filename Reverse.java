import java.util.Arrays;

public class Reverse {

    public static void main(String[] args){
        char[] arr={'h','a','r','s','h'};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Reverse(char[] s){
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left]= s[right];
            s[right]= temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}