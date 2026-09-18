public class D21 {
    public static void main(String[] args){
        pattern1(8);
    }
    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
