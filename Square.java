import java.util.Arrays;
public class Square{
    public static void main(String[] args){
        Square sq = new Square();
        int[] arr ={-4,-1,0,3,10};
        int [] result = sq.sortedSquares(arr);
        System.out.println(Arrays.toString(result));
    }
    public int[] sortedSquares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n-1;
        int pos = n-1;
        while(left<= right){
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];
            if(leftSq > rightSq){
                result[pos] = leftSq;
                left++;
            }else{
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}