public class TP21 {
    public static void main(String[] args){
        String  status1 ="On Time";
        String status2 = "on time";

        boolean isFlightOnTime = status1.equalsIgnoreCase(status2);

        System.out.println(isFlightOnTime);

    }
    
}
