public class D66 {
    public static void main(String[] args) {
        int i = 1;
        int count= 0; 
        int sum =0;
        while(i>=100){
            if(i%4==0 || i%6==0){
                sum=sum+i;
                count++;
        System.out.println(i);
            }
            i++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
    
}
