public class D64 {
    public static void main(String[] args) {
        
        int i =1;
        int count =0;
        int sum =0;
        while(i<=100){
            if(i%3==0 && i%5==0){
                count++;
                sum = sum+i;
            }
            i++;
        }
        System.out.println( "No.Of Count: "+count);
        System.out.println( "Sum: "+sum);
    }
    
}
