public class D51 {
    public static void main(String[]args){
        int largest =0;
        for(int i=1; i<=50; i++){
            if(i%2==0 && largest<i){
                largest =i;
            }
            
        }
        System.out.println(largest);
    }
    
}