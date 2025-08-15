class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        transpose(matrix, row, col);
        reverse(matrix, row, col);
    }

    public void transpose(int[][] matrix, int r, int c){
        int temp = 0;
        for(int i = 0; i < r - 1; i++){
            for(int j = i; j < c; j++){
                if(i != j){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    public void reverse(int[][] matrix, int r, int c){
        int temp = 0;
        for(int i = 0; i < r ; i++){
            for(int j = 0; j < c/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][c - 1 - j];
                matrix[i][c - 1 - j] = temp;
            }
        }
    }
}