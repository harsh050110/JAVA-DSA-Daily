import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {
        TwoPointer tp = new TwoPointer();

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};
        tp.duplicateRemover(arr);
    }

    public void duplicateRemover(int[] arr) {
        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        System.out.println("Unique count: " + (slow + 1));
        System.out.println("Unique elements: " +
                Arrays.toString(Arrays.copyOf(arr, slow + 1)));
    }
}
