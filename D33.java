import java.util.*;
public class D33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Selling Price of the Product: ");
        double sellingPrice = sc.nextDouble();

        System.out.println("Enter the Cost Price of the Product:  ");
        double costPrice = sc.nextDouble();

        if(sellingPrice > costPrice){
            System.out.println("Profit: " + (sellingPrice - costPrice));
        }
        else if(costPrice > sellingPrice){
            System.out.println("Loss: " + (costPrice - sellingPrice));
        }
        else{
            System.out.println("No Profit No Loss");
        }
    }
}
