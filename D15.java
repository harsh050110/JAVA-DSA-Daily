import java.util.*;

public class D15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String enteredUsername = sc.nextLine();

        String s1 = "Secure";
        int num = 12345;

        System.out.print("Enter your password: ");
        String enteredPassword = sc.next();

        System.out.print("Enter your clearance level: ");
        int clearanceLevel = sc.nextInt();

        if (enteredPassword.equals(s1) && clearanceLevel == num) {
            System.out.print("Access granted.");
        } else {
            System.out.print("Access denied.");
        }

        System.out.println(" System check completed.");

        sc.close();
    }
}
