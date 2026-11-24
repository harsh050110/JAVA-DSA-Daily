public class P42 {
    public static void main(String[] args) {
        int temp=9474;
        int a =temp;
        int count =0;
        int cube =0;
        int sum =0;

        
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=a;
        while(temp !=0){
            
            int digit = temp %10;
            temp/=10;
            cube = (int) Math.pow(digit, count);
            sum=sum+cube;
            System.out.println(cube);
        }
        System.out.println(sum);
        System.out.println(count);

    }
    
}
