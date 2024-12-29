class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[] rowcol : indices){
            for(int col = 0; col < n; col++) matrix[rowcol[0]][col]++;
            for(int row = 0; row < m; row++) matrix[row][rowcol[1]]++;
        }
        int res = 0;
        for(int[] row : matrix){
            for(int element : row) if(element % 2 != 0) res++;
        }
        return res;
    }
}