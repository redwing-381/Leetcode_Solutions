class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length; i++){
            res += mat[i][i];
        }

        for (int i = 0, j = mat.length - 1; j >= 0; i++, j--){
            if ( i == j) continue;
            res += mat[i][j];
        }
        return res;
    }
}