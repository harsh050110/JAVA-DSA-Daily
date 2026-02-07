import java.util.Scanner;

public class valid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        valid obj = new valid();
        boolean result = obj.isPerfectSquare(num);

        if (result) {
            System.out.println(num + " is a Perfect Square ✅");
        } else {
            System.out.println(num + " is NOT a Perfect Square ❌");
        }

        sc.close();
    }

    // Binary Search method
    public boolean isPerfectSquare(int num) {

        if (num < 2)
            return true;

        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Avoid overflow
            if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (mid > num / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
