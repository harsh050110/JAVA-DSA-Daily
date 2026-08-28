public class TP5 {
    public static void main(String[] args){
        int vehicleNumber = 1246;

        int lastDigit ;
        int evenOdd;

        lastDigit = vehicleNumber % 10;

        evenOdd = lastDigit % 2;

        System.out.println("Last Digit: "+ lastDigit);
        System.out.println("Even or Odd: "+evenOdd);

    }
    
}
