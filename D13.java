import java.util.*;

public class D13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight of the luggage in kg:  ");
        double weight = sc.nextDouble();

        int maxWeight =20;
        if(weight>maxWeight){
            System.out.println("The luggage is overweight. Please pay the extra charges.");
        }else{
            System.out.println("The luggage is within the weight limit. You can proceed.");
        }

        System.out.println("Luggage is measeured.");
        
    }

}