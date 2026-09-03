public class TP18 {
    public static void main(String[] args){
        String customerName = "Alice";
        String orderedDish ="Pasta";

        double totalPrice = 12.99;


        String orderSummary = "Customer".concat(customerName).concat("ordered").concat(orderedDish).concat("\n.").concat("The total price is $"+totalPrice+".");

        System.out.println("Customer Name: "+customerName);
        System.out.println("Ordered Dish: "+orderedDish);
        System.out.println("Total Price: $"+totalPrice);

        System.out.println(orderSummary);

    }
    
}
