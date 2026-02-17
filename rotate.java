public class rotate {
    public static void main(String[] args){
        int arr[] ={1,2,4,3,5,6,7,8};
        int last = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
