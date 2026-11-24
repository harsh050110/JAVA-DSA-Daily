public class P44 {
    public static void main(String[] args) {
        int i = 1234;
        int a=i;
        
        int reverse = 0;
        while(i!=0){
            int digit = i%10;
            i/=10;
            reverse = reverse *10+digit;
        }
        System.out.println(reverse);
        if(reverse == a ){
            System.out.println("1234 is a Palindrome");
        }else{
            System.out.println("1234 is not a Palindrome.");
        }
    }
    
}
