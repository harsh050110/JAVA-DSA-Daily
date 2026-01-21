public class diff{
    public static void main(String[] args){
        int[] arr={90,87,15,23,45,67,12};
        int diff=0;
        for(int i =0; i<arr.length-1; i++){
            diff=diff-arr[i];
        }
        System.out.println("The difference is:"+diff);
    }
}