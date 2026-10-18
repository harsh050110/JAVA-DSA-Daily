public class D38 {
    public static void main(String[]args){
        pattern1(9);
        pattern2(8);
        pattern3(7);
        pattern4(7);
        pattern5(8);
        pattern6(8);
        pattern7(6);
        pattern8(8);
        pattern9(8);
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
    static void pattern7(int n) {
    int rows = 2 * n - 1;
    int cols = 2 * n - 1;

    char[][] matrix = new char[rows][cols];

    for (int i = 0; i < rows; i++) {
        int stars;
        int spaces;

        if (i < n) {
            stars = 2 * i + 1;
            spaces = n - i - 1;
        } else {
            stars = 2 * (rows - i) - 1;
            spaces = i - n + 1;
        }

        for (int j = 0; j < spaces; j++) {
            matrix[i][j] = ' ';
        }

        for (int j = spaces; j < spaces + stars; j++) {
            matrix[i][j] = '*';
        }

        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] == '*' ? '*' : ' ');
        }

        System.out.println();
    }
}
static void pattern8(int n){
    for(int i=0; i<=n; i++){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}static void pattern9(int n){
    for(int i=0; i<=n; i++){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
}
