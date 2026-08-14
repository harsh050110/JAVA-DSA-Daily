package Loops;

public class T3 {
    public static void main(String[] args) {
        int arr[]={5,6,1,2,3,4};
        int max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
