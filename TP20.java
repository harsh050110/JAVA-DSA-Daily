public class TP20 {
    public static void main(String[] args){
        String flightstatus1 = "On Time";
        String flightstatus2 = "Delayed";

        int flightDistance = 500;
        int flightDuration = 2;

        boolean isFlightOnTime = flightstatus1.equals(flightstatus2);

        System.out.println("Flight Distance: "+ flightDistance);
        System.out.println("Flight Duration: "+ flightDuration);

        System.out.println(isFlightOnTime);
    }
    
}
