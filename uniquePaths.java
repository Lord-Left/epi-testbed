public class uniquePaths {
    
    public static int count;

    public static void main(String[] args) {

        count = 0;
        uniquePath(1,1,7,3);
        System.out.println(upDP(7,3));
    }

    public static void uniquePath(int sRow, int sCol, int row, int col) {

        // base case
        if(sRow == row && sCol == col) {
            count++;
        } else if (sRow > row || sCol > col) {
            return; // end the recursion
        } else {
            // recurse down
            uniquePath(sRow + 1, sCol, row, col);
            // recurse right
            uniquePath(sRow, sCol + 1, row, col);
        } 
    }

    public static int upDP(int row, int col) {

        int[][] matrix = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 || j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
                }
            }
        }

        return matrix[row-1][col-1];
    }

 
}