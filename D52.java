public class D52 {
    public static void main(String[]args){
        int smallest = 100;
        
        for(int i=1; i<=100;i++){
            if(i%2==0 && smallest>i){
                smallest =i;
            }
        }
        System.out.println(smallest);
    }
    
}
