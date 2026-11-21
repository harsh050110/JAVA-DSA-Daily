import java.util.*;

public class P34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int i = sc.nextInt();
        int a = i;
        int b = 0;
        while(i!=0){
            int digit = i%10;
            i/=10;
            b=b*10+digit;
        }
        if(a==b){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
        sc.close();
    }
}