package Loops;

public class P6 {
    public static void main(String[] args){
        int[][] matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int rows = matrix.length;
        int cols= matrix[0].length;
        int transpose[][]=new int [rows] [cols];
        //Transpose Logic
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        //Reverse Logic 
        for(int i =0; i<rows; i++){
            int left=0; 
            int right=cols-1;
            while(left<right){
                int temp=transpose[i][left];
                transpose[i][left]=transpose[i][right];
                transpose[i][right]=temp;
                left++;
                right--;
            }
        }
        //Print
        System.out.println("Rotated Matrix:");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
