import java.util.Scanner;

public class t2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] A = {
            {1,2},
            {3,4}
        };
        int [][] B ={
            {5,6},
            {7,8}
        };
        int result[][] = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2; k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Result of MAtrix: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
