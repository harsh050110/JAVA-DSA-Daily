package Loops;
import java.util.Scanner;

public class TS {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A :");
        A = sc.nextInt();
        System.out.println("Enter the value of B: ");
        B = sc.nextInt();

        System.out.println("Enter the operation you want to perform :");
        // System.out.println("sum");
        // System.out.println("sub");
        // System.out.println("mul");
        
        String operation = sc.next();

        switch (operation){
            case "sum":
                Sum sum = new Sum();
                sum.sum(A,B);
                break;
                case "sub":
                Substraction sub = new Substraction();
                    sub.sub(A,B);
                    break;
                    case "mul":
                        Multiplication mul = new Multiplication();
                        mul.mul(A,B);
                        break;
                        
        }
        
    }


    static class Multiplication {
        public void mul(int A, int B) {
            int product = A * B;
            System.out.println(product);
        }
    }

    static class Sum {
        public void sum(int A, int B) {
            int sum = A + B;
            System.out.println(sum);
        }
    }

    static class Substraction {
        public void sub(int A, int B) {
            int sub = A - B;
            System.out.println(sub);
        }
    }
}