class Solution {
    public void rotate(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        // transpose
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }

        // reverse 
        for (int i = 0; i < matrix.length; i++){

            0 1 2 3 
            1 -> 2, matrix[i].length - i - 1


            for (int j = 0; j < matrix[0].length; j++) {
                int right = matrix[i].length - i - 1;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][right];
                matrix[i][right] = templ

            }
        }

    }
}