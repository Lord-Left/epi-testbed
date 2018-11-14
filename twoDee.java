public class twoDee {

    public static void main(String[] args) {

        int[][] t = new int[10][10];

        for(int row = 1; row <= 10; row++) {

            for(int column = 1; column <= 10; column++) {
                t[row-1][column-1] = row * column; 
            }

        }

        System.out.println(productByArray(10, 7, t));
        System.out.println(productByArray(8, 7, t));


    }

    public static int productByArray(int x, int y, int[][] arr) {

        return arr[x-1][y-1];
    }
}