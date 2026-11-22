public class P39 {
    public static void main(String[] args) {
        int i=153;
        int a =i;
        int digit = 0;
        double cube = 0;
        while(i!=0){
            digit =i%10;
            i=i/10;

        cube = Math.pow(digit, 3);

        System.out.println(cube);
        }
        System.out.println();
    }
    
}
