import java.util.*;

public class D23{
    public static void main(String[] args){
        shop(5);
    }
    static void age(int n){
        int age;
        Scanner sc = new Scanner(System.in);
        String question = "Enter your age: ";
        System.out.print(question);
        age = sc.nextInt();
        if(age>=17){
            System.out.println("You are adult");
        }else if(age<17){
            System.out.println("You are not adult");
        }else{
            System.out.println("You are old age");
        }
    }
    static void shop(int n){
        Scanner sc = new Scanner(System.in);
        String question = "Enter you total bill: ";
        System.out.print(question);
        int totalBill = sc.nextInt();
        String question1 = "Enter your total items: ";
        System.out.print(question1);
        int totalItems = sc.nextInt();
        int averageBill;
                averageBill = totalBill/totalItems;
                System.out.println("Your average bill is: "+averageBill);

                if(averageBill>10000){
                    System.out.println("You are a premium customer");

                }else if(averageBill<5000){
                    System.out.println("You are a regular customer");
                }else{
                    System.out.println("You are a normal customer");
                }
    }
}