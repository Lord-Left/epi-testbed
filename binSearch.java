// log n operation - implementation by cpt2132
import java.util.*;

public class binSearch {

	public static void main(String[] arg) {
		int[] a = {0,2,5,134,900,35657};
		System.out.println(bSearch(a, 900, 0, a.length - 1));
	}

	public static int  bSearch(int[] arr, int target, int lowerBound, int upperBound) {
	
		if(lowerBound > upperBound) {
			return -1; // error condition
		}

		// find midpoint, compare to target
		int mid = (lowerBound + upperBound) / 2;

		if(arr[mid] == target) {
			return mid;
		} else if (target < arr[mid]) {
			return bSearch(arr, target, lowerBound,  mid - 1);
		} else {
			return bSearch(arr, target, mid + 1, upperBound);
		}


	}	
}
