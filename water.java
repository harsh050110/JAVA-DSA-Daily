import java.util.Arrays;
import java.util.Scanner;

public class water {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter height values:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        water obj = new water();
        int result = obj.maxArea(height);

        System.out.println("Array: " + Arrays.toString(height));
        System.out.println("Maximum Water Area: " + result);

        sc.close();
    }

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            max = Math.max(max, area);

           
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
