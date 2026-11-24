public class P41 {
    public static void main(String[] args) {
        int i=123;
        int a = i; 
        int cube = 0;
        int sum = 0;
        while(i!=0){
            int digit = i%10;
            i/=10;

            cube = (int) Math.pow(digit, 3);
            sum= sum+cube;
            System.out.println(cube);
        
        }
        if(sum==a){
            System.out.println("123 is a Armstrong number.");
        }else{
            System.out.println("123 is not Armstrong number.");
        }
    }
    
}
