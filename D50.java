public class D50 {
    public static void main(String[]args){
        // int sum =0; 
        int count =0;
        for(int i =1; i<=20; i++){
            if(i%3==0&& i<=18&&i>15){
               
                count++;
                System.out.println(i);
            }
            
        }
        System.out.println("Count: "+count);
    }
    
}
