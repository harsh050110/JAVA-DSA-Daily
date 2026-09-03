public class TP17 {
    public static void main(String[] args){
        String street = "123 Main St";
        String city = "Springfield";
        String state = "IL";

        String fullAddress = street.concat(",").concat(city).concat(state);

        System.out.println("Full Address: "+fullAddress);
        
    }
    
}
