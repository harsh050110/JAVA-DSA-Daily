public class P35 {
    public static void main(String[] args) {
        int i=1331;
        int reverse =0;
        int original = i;
        while(i!=0){
            int digit = i%10;
            i/=10;
            reverse= reverse*10+digit;
        }
        if(original==reverse){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }
        System.out.println();
    }

    
}
