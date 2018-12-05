/* 
cleaner algorithim for parenthesis generation! 
*/

import java.util.ArrayList;
import java.util.List;

public class gP2 {

    public static void main(String[] args) {
        
        System.out.println(generateParenthesis(4));

    }

    public static List<String> generateParenthesis(int n) {

        List<String> ret = new ArrayList();
        helper(ret, "", 0, 0, n);

        return ret; 
    }

    public static void helper(List<String> list, String str, int left, int right, int max) {

        // base case
        if(str.length() == max * 2) {
            list.add(str);
            return; // terminate recursive call
        }

        // backtracking & exploration of choices
        if(left < max) {
            helper(list, str + "(", left + 1, right, max);
        }
        if(right < left) {
            helper(list, str + ")", left, right + 1, max);
        }

    }
}