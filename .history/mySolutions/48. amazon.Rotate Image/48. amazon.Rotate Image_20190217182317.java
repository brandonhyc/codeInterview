class Solution {
    public void rotate(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        // transpose
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }

        // reverse 
        int xLength = matrix[0].length;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                

            }
        }

        return;
    }
}