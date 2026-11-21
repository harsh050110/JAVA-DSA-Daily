public class P29 {
    public static void main(String[] args) {
        int i =9082;
        int reverse =0;
        while(i!=0){
            int digit = i%10;
            i/=10;
            reverse = reverse*10+digit;
        }
        System.out.println("The reverse is : "+reverse);
    }
}
