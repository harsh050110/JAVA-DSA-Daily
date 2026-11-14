public class D69 {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int i=1;
        while(i<=100){
            if(i%4==0 || i%6==0){
               if(i<smallest){
                 smallest = i;
               }
               
            }
            i++;
        }
        System.out.println(smallest);
    }
    
}
