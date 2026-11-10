public class D59 {
    public static void main(String[]args){
        int i=1;
        int sum =0;
        int count=0;
        while(i<=50){
            if(i%2==0){
                sum =sum+i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(count);
    }
    
}
