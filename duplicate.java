import java.util.*;
import java.util.Scanner;
 
public class duplicate{
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("enter rotated sorted array element");
        for(int i = 0; i<n; i++){
            nums[i]=sc.nextInt(n);

        }
        rotated obj = new rotated();
        int min = obj.findMin(nums);

        System.out.println("Array"+ Arrays.toString(nums));
        System.out.println("Minimum element"+min);
        sc.close();
    }

    public int findMin(int[]nums){
        int left=0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else if(nums[mid]<nums[right]){
                right = mid;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}