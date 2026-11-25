public class P47 {
    public static void main(String[] args) {
        int i =1234;
        int reverse =0;
        int a =i;

        while(i<=0){
            int digit = i%10;
            i/=10;
            reverse = reverse *10+digit;
        }
        System.out.println(reverse);
        if(a==reverse){
            System.out.println("1234 is a Palindrome");
        }else{
            System.out.println("1234 is not a Palindrome");
        }
    }
}
