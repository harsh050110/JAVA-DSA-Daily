package array;
public class Max{
    static int[] findMinMax(int[]arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min, max};
    }
    public static void main(String[]args){
        int[] arr={3,4,7,8,2,1,8,0,5};
        int[] result=findMinMax(arr);
        System.out.println(result[0]+" "+result[1]);
    }
}