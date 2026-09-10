import java.util.Scanner;

public class D10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int minSeniorAge = 60;
        if(age >= minSeniorAge){
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
        
    }
    
}
