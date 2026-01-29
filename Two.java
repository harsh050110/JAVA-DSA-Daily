public class Two{
    public static void main(String[] args){
        int[ ] num = {2,7,11,15};
        int target = 17;
        int[] result = twoSum(num, target);
        System.out.println(result[0]+ "," + result[1]);
    }
    public static int[] twoSum(int[] num, int target){
        int left =0;
        int right = num.length-1;
        while(left<right){
            int sum = num[left] + num [right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }else if(sum == target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}