import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1){
            isPrime=false;
        }else{
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
    }if(isPrime){
        System.out.println("Prime Number");
    }else{
        System.out.println("Not a Prime Number");
    }
    }
}

