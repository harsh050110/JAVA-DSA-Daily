public class D73 {
    public static void main(String[] args) {
        int i =1; 
        int sum =0;
        int count =0;

        while(i<=100){
            if(i%3==0 && i%5!=0){
                count++;
                sum=sum+i;
            }
            i++;
        }
        System.out.println(i);
        System.out.println(sum);
        System.out.println(count);
    }
    
}
