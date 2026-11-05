public class D51 {
    public static void main(String[]args){
        int smallest=50;
                for(int i=1; i<=50; i++){
            if(i%2!=0 && i < smallest){
                smallest =i;
            }
        }

            System.out.println(smallest);
    }
    
}
