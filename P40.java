public class P40 {
    public static void main(String[] args) {
        int i = 153;
        int a =i;
        int sum=0;
        int cube = 0;
        while(i!=0){
          int  digit = i%10;
          i/=10;

          cube = (int) Math.pow(digit, 3);
          sum=sum+cube;
          System.out.println();
        }if(sum==a){
            System.out.println("153 is Armstrong number.");
        }else{
            System.out.println("153 is not Armstrong number");
        }
        System.out.println(sum);
    }
    
}
