import java.util.*;
public class D14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.println("Enter the value of humidity: ");
        double humidity = sc.nextDouble();

        if(temperature>30 && humidity>70){
            System.out.println("The weather is hot and humid.");
        }else{
            System.out.println("The weather is not hot and humid.");
        }
        System.out.println("Weather is check completed.");
    }
    
}
