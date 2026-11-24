public class P43 {
    public static void main(String[] args) {
        int i = 4567;
        int reverse =0;
        
        while(i!=0){
            int digit = i%10;
            i/=10;
            reverse = reverse*10+digit;
        }
        System.out.println(reverse);
    }
    
}
