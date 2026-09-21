public class D24 {
    public static void main(String[] args){
        pattern1(5);
        pattern2(7);
        pattern3(7);
    }
    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("A");
            }
            System.out.println(); 
        }
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i =7; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
    
}
