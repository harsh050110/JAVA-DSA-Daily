public class D45 {
    public static void main(String[]args){
        pattern1(5);
        pattern2(4);
        pattern3(6);
        pattern4(7);
        pattern5(8);
        pattern6(7);
        pattern7(9);
    }
    static void pattern1(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int k=3; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1; i<=4; i++){
            for(int k=3; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print ("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=7; i>1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
