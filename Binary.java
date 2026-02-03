import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        Binary b = new Binary();
        int result = b.search(nums, target);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target index: " + result);
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
