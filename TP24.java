public class TP24 {
    public static void main(String[]args){
        int[] arr1 = {2,3,87,90};
        int[] arr2 = {7,8,9,100,189};


        // comparison

        if(arr1[0]>arr2[4])
            
                System.out.println("the number will be greater");
        else{
            System.out.println("Not greater than that");
        }
        
        int sum = arr1[3]+arr2[4];

        System.out.println("The Total Sum: "+sum);
        

        // concat

        String customerName = "William";

        String OrderPurchased ="Pizza";

        double Amount = 12.99; 


        String orderSummary= "His name is ".concat(customerName).concat(" purchase item is ").concat(OrderPurchased).concat(". The Order Cost of : $"+Amount);

        System.out.println(orderSummary);


        }
    
}
