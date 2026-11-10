public class D60 {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int i=1;
        while(i<=100){
            if(i>largest){
                largest = i;
                
            }
            i++;
        }
        System.out.println(largest);
    }
    
}
