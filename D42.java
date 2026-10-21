public class D42 {
    public static void main(String[]args){
        int []arr = {2,3,5,7,11,15};
        int target = 18;

        int left =0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" and "+arr[right]);
                break;
            }else if(sum!=target){
                left++;
            }else{
                right--;
            }
        }
    }
    
}
