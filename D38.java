public class D38 {
    public static void main(String[]args){
        pattern1(9);
        pattern2(8);
    }
    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("8");

            }
            System.out.println();
        }
    }
    
}
