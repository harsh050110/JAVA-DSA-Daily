import java.util.*;


public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            
            int reverse =0;
        System.out.println("Enter the integer: ");
        int i = sc.nextInt();
        while(i!=0){
            int digit = i%10;
            i/=10;
            reverse = reverse*10+digit;
        }
        System.out.println(reverse);
    }
    
}
