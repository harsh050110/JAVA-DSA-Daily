public class D61 {
    public static void main(String[]args){
        int smallest = Integer.MAX_VALUE;
        int i =1; 
        while(i<=100){
            if(i<smallest && i%2==0){
                smallest =i;
            }
            i++;
        }
        System.out.println(smallest);
    }
    
}
