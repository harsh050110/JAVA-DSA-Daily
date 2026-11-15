public class D71 {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        int sum =0;
        while(i<=100){
            if(i%2!=0 && i%3==0){
                count++;
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(count);
    }
    
}
