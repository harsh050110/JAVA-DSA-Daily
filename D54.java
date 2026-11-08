public class D54{
    public static void main(String[]args){
        int largest = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<=100; i++){
            if(i%2!=0 && i>largest){
                largest=i;
                
count++;
            }
        
        }

        System.out.println("Largest: "+largest);

            System.out.println(count);
    }
}