public class D8 {
    public static void main(String[] args){
        pattern1(4);
        pattern2(5);
    }
    static void pattern1(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i<=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
       
        
    }
    
}
