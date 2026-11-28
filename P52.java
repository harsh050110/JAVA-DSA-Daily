public class P52 {
    public static void main(String[] args) {
        int n =9;
        int i =2;
        boolean isPrime = true;
        while(i<n){
            if(n%i==0){
                isPrime = false;
            break;
            }
            i++;
        }
        if(isPrime){
                System.out.println("Prime Number");
            }else{
                System.out.println(" non-prime number.");
            }
        System.out.println();
    }
    
}
