class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int col0 = 1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j == 0){
                        col0 = 0;
                    }else{
                        matrix[0][j] = 0;
                    }
                }
            }
        }
       
        for(int i = row - 1; i >= 1; i--){
            for(int j = col - 1; j >= 1; j--){
                if((matrix[i][j] != 0) && matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

       if(matrix[0][0] == 0){
            for(int j = 1; j < col; j++){
                matrix[0][j] = 0;
            }
       }

       if(col0 == 0){
            for(int j = 0; j < row; j++){
                matrix[j][0] = 0;
            }
       }
    }
}