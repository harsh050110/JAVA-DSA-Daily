import java.util.*;
public class min{
    static int min(int[]arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
    public static void main(String[]args){
        int[] arr={3,4,7,6,2,18,1,5};
        int result=min(arr);
        System.out.println(result);
    }
}