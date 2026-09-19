public class D22 {
    public static void main(String[] args){
        pattern1(5);
        pattern2(4);
        pattern3(3);
    }
    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=3; j++){
                System.out.print("^");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=3; i>=1; i--){
            for(int j=1;j<=i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=4; j>=i; j--){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    
}
