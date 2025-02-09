import java.util.Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        transpose(matrix, m, n);

        reverseRow(matrix, m, n);
    }

    public void reverseRow(int[][] matrix, int row, int col)
    {
        int temp = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col / 2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][col - 1 - j];
                matrix[i][col - 1 - j] = temp;
            }
        }
    }

    public void transpose(int[][] matrix, int row, int col)
    {
        int temp = 0;
        for(int i = 0; i < row; i++){
            for(int j = i + 1; j < col; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}