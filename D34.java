import java.util.*;

public class D34{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Prinicipal Amount: ");
        double prinicipalAmount = sc.nextDouble();

        System.out.println("Enter the Rate of Interest: ");
        double rateofInterest = sc.nextDouble();

        System.out.println("Enter the Time Period: ");
        double timePeriod = sc.nextDouble();

        double simpleInterest = (prinicipalAmount * rateofInterest * timePeriod) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        int compoundInterest = (int)(prinicipalAmount * Math.pow((1 + rateofInterest / 100), timePeriod) - prinicipalAmount);
        System.out.println("Compound Interest: " + compoundInterest);
        
    }
}