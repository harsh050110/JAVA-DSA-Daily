public class D50 {
    public static void main(String[]args){
        int sum =0; 
        int count =0;
        for(int i =1; i<=20; i++){
            if(i%3==0){
                sum=sum+i;
                count++;
                System.out.println("Count: "+i);
            }
            
        }
        System.out.println(count);
        System.out.println("Sum: "+sum);
    }
    
}
