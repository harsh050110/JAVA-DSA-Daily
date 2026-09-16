public class D19 {
    public static void main(String[] args) {
        pattern1(8);
        pattern2(8);
        pattern3(5);
        pattern4(5);
        pattern5(5);
    }

    static void pattern1(int n) {
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            

        System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=5; j>i; j--){
                System.out.print("");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
    }
}
static void pattern4(int n){
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
static void pattern5(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            System.out.print("8");
        }
        System.out.println();
    }
}


}
