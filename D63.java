public class D63 {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int i =1;
        int count =0;
        while(i<=100){
            if(i%2!=0){
                count++;
            }
            if(i%2!=0 && i>largest){
                largest = i;
            }
            i++;
        }
        System.out.println("No. of Largest: "+ largest);
        System.out.println("No. of the Count: "+count);
    }
    
}
