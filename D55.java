import java.util.Scanner;

public class D55 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int largest =Integer.MIN_VALUE;
        int count =0;
        for(int i =0; i<=10; i++){
            if(i%2!=0 && i>largest){
                count++;

                largest = i;
            }
            
            
        }
        System.out.println(largest);

            System.out.println(count);
    }
}
