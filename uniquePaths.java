public class uniquePaths {
    
    public static int count;

    public static void main(String[] args) {

        count = 0;
        uniquePath(1,1,7,3);
        System.out.println(count);
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
}