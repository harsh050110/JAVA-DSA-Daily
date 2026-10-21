import java.util.*;



public class D39{
    public static void main(String[] args){
        int num[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
    static int[] twoSum(int num[], int target){
        Map<Integer, Integer>map = new HashMap<>();
        for(int i=0; i < num.length; i++){
            int complementary = target-num[i];
            if (map.containsKey(complementary)) {
                return new int[]{map.get(complementary), i};
            }
            map.put(num[i], i);
        }
        return new int[]{-1, -1};2
    }
}
