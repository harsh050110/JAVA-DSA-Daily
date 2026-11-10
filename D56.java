public class D56 {
    public static void main(String[]args){
        int count =0;
        int smallest = Integer.MAX_VALUE;
        for(int i =1; i<=100; i++){
            if(i%2!=0){
                count++;
            }
            if(i%2!=0 && smallest > i){
                smallest = i;
            }
            

        }

        System.out.println(count);
        System.out.println("int smallest = "+smallest);


    }
    
}
