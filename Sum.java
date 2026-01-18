import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int sum = n*(n+1)/2;
        // Output
        System.out.println("Sum of first" +n+"numbers:"+sum);

        scanner.close();
    }
}
