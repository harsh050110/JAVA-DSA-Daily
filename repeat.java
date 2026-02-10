import java.util.Arrays;
import java.util.Scanner;
public class repeat {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];

        System.out.println("Enter array element(rotated sorted):");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        Solution obj = new Solution();
        int index = obj.search(nums, target);
        System.out.println("Array:" + Arrays.toString(nums));
        System.out.println("Target:"+ target);
        System.out.println("Target Index"+ index);
        sc.close();
    }
static class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

       
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

}
