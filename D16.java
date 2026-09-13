import java.util.*;

public class D16 {
    public static void main(String[] args){
        pattern1(5);
        pattern2(6);
        pattern3(4);
    }
    static void pattern1(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                System.out.print("%");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}