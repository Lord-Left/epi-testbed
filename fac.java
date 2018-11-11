public class fac {

    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(factorialDP(3, new int[4]));
    }

    public static int factorial(int x) {

        // base case
        if(x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }

    public static int factorialDP(int x, int[] memo) {

        // base case
        if(x <= 0 || x == 1) {

            return 1; 

        } else if(memo[x] == 0) {

            memo[x] = x * factorialDP(x-1, memo);
        }

        return memo[x];
    }
}