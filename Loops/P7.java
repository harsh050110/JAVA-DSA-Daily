package Loops;

public class P7 {
    public static void main (String[] args){
        int[][] matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
         int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        System.out.println("Spiral Traversal:");

        while(top <= bottom && left <= right) {

            // LEFT → RIGHT
            for(int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // TOP → BOTTOM
            for(int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // RIGHT → LEFT
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // BOTTOM → TOP
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
