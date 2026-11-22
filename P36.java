public class P36 {
    public static void main(String[] args) {
        int i = 1234321;
        int a = i; 
        int b = 0;
        while(i!=0){
            int digit = i%10;
            i/=10;
            b=b*10+digit;
        }
        if(a==b){
            System.out.println("1234321 is Palindrome");
        }else{
            System.out.println("1234321 is not Palindrome");
        }
        System.out.println();
    }
    
}
