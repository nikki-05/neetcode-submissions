class Solution {
    public int[][] transpose(int[][] matrix) {
        //transpose of a square  matrix is swipe diagonal 
        //else it is rows becomes columns/versa
        int rows= matrix.length;
        int col= matrix[0].length;
        int[][] temp= new int[col][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
              temp[j][i] = matrix[i][j];
            }
        }
        return temp;
        
    }
}