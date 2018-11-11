import java.util.*;

public class twelveSix {

		public static void main(String[] args) {
			/* algorithim:
			   1) Take in array of strings 
			   2) Take in a set of strings (values that we're trying to find the shortest subarray of)
			   3) iterate over array. set a first value when that string is contained in hs. 

			*/

			/* save : 0 | our : 1 | our : 4 | union : 5 | save : 6 | union: 7*/
			String[] strArr = {"save", "our", "world", "and", "our", "union", "save", "union"};
			HashSet<String> hs = new HashSet<>();

			hs.add("save");
			hs.add("our");
			hs.add("union");


		}
}
