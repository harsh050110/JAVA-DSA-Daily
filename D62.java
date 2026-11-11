public class D62 {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int i =1;
        int count = 0;
        while(i<=100){
            if(i%2 !=0){
                count ++;
            }
            if(i%2!=0 && i< smallest){
                smallest = i;
            }
            i++;
        }
        
        System.out.println(smallest);
        System.out.println("No. of count: "+ count);
    }
    
}
