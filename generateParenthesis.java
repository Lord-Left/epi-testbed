import java.util.*;
import java.lang.StringBuilder;

public class generateParenthesis {


    public static void main(String[] args) {

        System.out.print(genP(2));
        // genP(2);


    }

    // entry-point function
    public static List<String> genP(int n) {

        StringBuilder tmp = new StringBuilder();
        List<String> ret = new LinkedList<>();

        genPRecurse(n, ret, 1, tmp, 0);

        return ret;

    } 

    /*
    leftParen 
    middle = leftParen +1
    rightParen = leftParen + 2
    */

    // recursive helper function
    public static void genPRecurse(int n, List<String> s, int count, StringBuilder mut, int leftParen) {

        int middle = leftParen + 1;
        int rightParen = leftParen + 2;

        // base case
        if (count == 1) {
            mut.append("()");
        }

        if (count == n) {
            s.add(mut.toString());
            return;
        }

        // use a for loop - for each cycle of i, choose to explore a path and insert into string builder
        for(int i = 1; i <= n; i++) {

            if(i == 1) {
                // prepend
                // int off = mut.indexOf("()"); // find first instance of ()
                mut.insert(leftParen, "()");
                // System.out.println("i == 1 " + mut);
                genPRecurse(n, s, count+1, mut, leftParen);

            } else if (i == 2) {
                // int off = mut.indexOf("()");
                mut.insert(middle, "()");
                // System.out.println("i == 2 " + mut);
                genPRecurse(n, s, count+1, mut, middle);

            } else if (i == 3) {

                // int off = mut.indexOf("()");
                mut.insert(rightParen, "()");
                // System.out.println("i == 3 " + mut);
                genPRecurse(n, s, count+1, mut, rightParen);

            }

        }
        
    }
}