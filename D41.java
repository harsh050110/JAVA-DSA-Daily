public class D41 {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,6,7,8};
        int target = 14;

        int left =0;
        int right = arr.length-1;

        while(left<right){

            int sum = arr[left]+arr[right];

            if(sum==target){
                System.out.println(arr[left]+"&&"+arr[right]);
                break;
            }else if (sum < target){
                left++;
            }else{
                right--;
            }
        }
    }
    
}
