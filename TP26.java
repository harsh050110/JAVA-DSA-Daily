import java.util.Scanner;

public class TP26 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
         

        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("The Total Sum: "+sum);


    }
    
}
