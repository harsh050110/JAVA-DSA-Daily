public class P19 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1||j==2*i-1||i==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
