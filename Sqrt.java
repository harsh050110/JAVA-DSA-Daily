import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int x = sc.nextInt();

        Sqrt obj = new Sqrt();
        int result = obj.mySqrt(x);

        System.out.println("Integer square root of " + x + " is: " + result);

        sc.close();
    }

  
    public int mySqrt(int x) {

      
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (mid <= x / mid) {
                ans = mid;        
                left = mid + 1;   
            } else {
                right = mid - 1;  
            }
        }
        return ans;
    }
}
