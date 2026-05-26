package Loops;

public class L22 {
    public static void printNumbers(int n) {

        // Base condition
        if(n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Print after recursion
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        int n = 5;

        printNumbers(n);
    }
}
