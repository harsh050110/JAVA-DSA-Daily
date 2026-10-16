public class D38 {
    public static void main(String[]args){
        pattern1(9);
        pattern2(8);
        pattern3(7);
        pattern4(7);
        pattern5(8);
        pattern6(8);
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
    static void pattern3(int n){
        for(int i=1; i<=7; i++){
            for(int j=0; j<=i; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=n; i>=2; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
