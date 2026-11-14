public class D70 {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum =0;
        int count =0;
        int i =1;
        while(i<=100){
            if(i%4==0 || i%6==0){
                if(i<smallest ){
                    smallest =i;
                }
                if(i>largest){
                    largest =i;
                }
                sum = sum+i;
                count++;
            }
            i++;
        }
        System.out.println("sum: "+sum);
        System.out.println("count: "+count);
        System.out.println("largest: "+largest);
        System.out.println("smallest: "+smallest);
    }
    
}
