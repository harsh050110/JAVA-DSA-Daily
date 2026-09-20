import java.util.*;

public class D23{
    public static void main(String[] args){
        age(6);
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
}