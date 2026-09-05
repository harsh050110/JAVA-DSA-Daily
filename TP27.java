import java.util.*;

public class TP27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of books: ");
        int totalBook = scanner.nextInt();

        System.out.print("Enter number of students: ");
        int numberofStudent = scanner.nextInt();

        int studentperbook = totalBook / numberofStudent;
        int remainingbook = totalBook % numberofStudent;

        System.out.println("Books per student: " + studentperbook);
        System.out.println("Remaining books: " + remainingbook);

        scanner.close();
    }
}
