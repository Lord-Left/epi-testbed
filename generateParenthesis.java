import java.util.*;
import java.lang.StringBuilder;

public class generateParenthesis {


    public static void main(String[] args) {


        // System.out.println(genP(1));
        // System.out.println(genP(2));
        // System.out.println(genP(3));
        System.out.println(genP(4));


    }

    // entry-point function
    public static List<String> genP(int n) {

        StringBuilder tmp = new StringBuilder();
        HashSet<String> s = new HashSet<>();

        genPRecurse(n, s, 1, tmp, 0);

        List<String> ret = new ArrayList<>(s);
        Comparator<String> c = Comparator.comparing(String::toString);
        ret.sort(c);

        return ret;

    } 


    // recursive helper function
    public static void genPRecurse(int n, HashSet<String> s, int count, StringBuilder mut, int left) {

        int middle = left + 1;
        int right = left + 2;

        // base case
        if (count == 1) {
            mut.append("()");
        }

        if (count == n) {
            s.add(mut.toString());
            return;
        } 

        // use a for loop - for each cycle of i, choose to explore a path and insert into string builder
        for(int i = 1; i <= 4; i++) {

            if(i == 1) {
                // prepend
                mut.insert(left, "()");
                genPRecurse(n, s, count+1, mut, left);
                // System.out.println("i : " + i + " mut : " + mut + " count : " + count);
                mut.delete(left, right);

            } else if (i == 2) {

                mut.insert(middle, "()");
                genPRecurse(n, s, count+1, mut, middle);
                // System.out.println("i : " + i + " mut : " + mut + " count : " + count);
                mut.delete(middle, right+1);

            } else if (i == 3) {

                mut.insert(right, "()");
                genPRecurse(n, s, count+1, mut, right);
                // System.out.println("i : " + i + " mut : " + mut + " count : " + count);
                mut.delete(right, right+2);

            } // else if (i == 4 ) {

            //     // explore edge case
            //     int off = mut.indexOf("()");

            //     if(off == 0) {
            //         mut.insert(off, "()");
            //         genPRecurse(n, s, count+1, mut, off+1);
            //         System.out.println("i : " + i + " mut : " + mut + " count : " + count);

            //         mut.delete(off, off+2); }
                
            //     // off = mut.lastIndexOf(" ()");
            //     // mut.insert(off, "()");
            //     // genPRecurse(n, s, count+1, mut, off+1);
            //     // System.out.println("i : " + i + " mut : " + mut + " count : " + count);

            //     // mut.delete(off, off+2);

            // }

        }


        
    }
}