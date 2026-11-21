import java.util.*;

public class P33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int i= sc.nextInt();

        int reverse = 0;

        while(i!=0){
            int digit = i%10;
            i/=10;
            reverse = reverse*10+digit;
        }
        System.out.println("Reversed number: "+ reverse);
    }
    
}
