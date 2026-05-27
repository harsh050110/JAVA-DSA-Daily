package Loops;
public class L23 {
   public static int fibonacci(int n) {

        // Base conditions
        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 7;

        for(int i = 0; i < n; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }
}
