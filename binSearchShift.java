// log n operation - implementation by cpt2132
import java.util.*;

public class binSearchShift {

	public static void main(String[] arg) {
		int a = {1,2,3,4,5}; // shifted array around pivot = 2
		int b = {3,4,5,1,2};
		System.out.println(bSearch(a, 4, 0, a.length - 1));

		// shifted bSearch - first check final element
		int tar = 4;
		int bLen = b.length-1;
		int pivot = 0;
		if(b[bLen] == tar) {
			return bLen; 
		} else if(bLen > tar) {
			pivot = pivotFinder(arr, lower, upper)
		}
	}

	// write a method to find pivot - use a modified bSearch!

	public static int pivotFinder(int[] arr, int lower, int upper) {

		if(lower > upper) {
			return -1; 
		}

		// how do we know if we find the pivot? if arr[i] > arr [i+1]!
		int mid = (upper + lower)/ 2; // overflow error!

		if(arr[mid] > arr[mid+1]) {
			return mid;
		} else if (arr[mid] < arr[mid-1]) {
			return mid - 1;
		} else {
			// if the above two conditions do not capture the pivot, we know the pivot must reside to the 'right' of mid + 1
			pivotFinder(arr, (mid + 1), upper);
		}
	}

	public static int bSearch(int[] arr, int target, int lowerBound, int upperBound) {
	
		if(lower > upper) {
			return -1; 
		}

		int mid = (upper + lower)/ 2; // overflow error!

		if(arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			bSearch(arr, target, mid + 1, upperBound);
		} else {
			bSearch(arr, target, lowerBound, mid - 1);

		}

	}	
}
