public class P50 {
    public static void main(String[] args) {
        int i= 12321;
        int a =i;
        int reverse =0;
        while(i!=0){
            int digit =i%10;
            i/=10;
            reverse = reverse*10+digit;
        }
        if(a==reverse){
            System.out.println("12321 is a Palindrome.");
        }else{
            System.out.println("12321 is not a Palindrome.");
        }
        
            }
    
}
