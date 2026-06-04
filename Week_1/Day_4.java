// Matrix Diagonal Sum 
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += mat[i][i];
            sum += mat[i][n-1-i];
        }
        if(n%2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}

//Reshape the Matrix

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c){
            return mat;
        }
        if(r==m && c==n){
            return mat;
        }
        int n_index = 0;
        int o_index = 0;
        int new_mat[][] = new int[r][c];
        while(n_index < r*c && o_index < m*n){
            new_mat[n_index/c][n_index%c] = mat[o_index/n][o_index%n];
            n_index++;
            o_index++;
        }
        return new_mat;
    }
}

// Spiral Matrix 

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result  = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left= 0;
        int right = matrix[0].length-1;

        while(left <= right && top <= bottom){
            for(int j = left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int j = right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;

    }
}
