public class P39 {
    public static void main(String[] args) {
        int i=153;
        int a =i;
        int sum =0;

        int digit = 0;
        int cube = 0;
        while(i!=0){
            digit =i%10;
            i=i/10;

        cube = (int) Math.pow(digit, 3);
        sum = sum+cube;
        System.out.println(cube);
        }
        
        System.out.println(sum);
    }
    
}
