public class set{
    public static void main(String[] args){
        int[] arr={23,34,55,67,89,72,06,80};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum is:"+sum);
    }
}