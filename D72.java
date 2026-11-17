public class D72 {
    public static void main(String[] args) {
        int i=1;
        int count =0;
        int sum =0;
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        while(i<=100){
            if(i%3==0||i%5==0){
                 sum= sum+i;
                if(Largest<i){
                    Largest =i;
                
                }
                if(Smallest >i){
                    Smallest =i;
                }
                count++;
               
            }
            i++;
            
        }
        System.out.println("SUM: "+sum);
        System.out.println("Count: "+count);
        System.out.println("Largest: "+Largest);
        System.out.println("Smallest: "+Smallest);
    }
    
}
