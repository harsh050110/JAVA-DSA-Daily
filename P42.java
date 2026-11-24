public class P42 {
    public static void main(String[] args) {
        int i=1234;
        int a =i;
        int cube =0;
        int sum =0;
        while(i!=0){
            int digit = i%10;
            i/=10;
            cube =(int) Math.pow(digit, 4);
            sum= sum +cube;
            System.out.println(cube);
        }
        System.out.println(sum);
        if(sum==a){
            System.out.println("8208 is an Armstrong Number.");
        }else{
            System.out.println("8208 is not an Armstrong number.");
        }

    }
    
}
