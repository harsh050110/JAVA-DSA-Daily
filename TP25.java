public class TP25 {
    public static void main(String[]args){
        
        int CostPrice = 100;
        int SellPrice = 250;

        
        int CostPrice2= 200;
            int SellPrice2 = 150;
        

        int Profit = SellPrice-CostPrice;

        
        int Loss = CostPrice2-SellPrice2;

        if(SellPrice>CostPrice){
            System.out.println("The Seller is making Profit of"
                +Profit);

            
        }else{
            System.out.println("The Seller is making Loss of"
                +Loss);
        }

        if(SellPrice2>CostPrice2){
            System.out.println("The Seller is making Profit of"
                +Profit);

            
        }else{
            System.out.println("The Seller is making Loss of"
                +Loss);
        }
    }
    
}
