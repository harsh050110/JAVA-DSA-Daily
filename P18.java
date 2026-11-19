public class P18 {
    public static void main(String[] args) {
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1||i==4||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
