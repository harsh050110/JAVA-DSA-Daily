import java.util.*;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter an integer: ");
       int num = sc.nextInt();

       int  sum =0;
       while(num!=0){
          int digit = num %10;
          sum = sum +digit;
          num /=10;
       }
       System.out.println("Sum of digit= "+sum);

       sc.close();
    }
}
