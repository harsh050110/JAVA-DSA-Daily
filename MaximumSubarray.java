import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaximumSubarray obj = new MaximumSubarray();
        int result = obj.maxSubArray(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }

    // Kadane's Algorithm
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
