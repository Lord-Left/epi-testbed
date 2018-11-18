import java.lang.reflect.Array;

public class mergeSort {

    public static void mS(int[] arr, int[] temp, int leftStart, int rightEnd) {

        // if leftStart is greater than or equal to rightEnd, something has gone awry
        if(leftStart >= rightEnd) {
            return;
        }

        // mid point
        int middle = (leftStart + rightEnd) / 2;

        // perform mS on various halves
        mS(arr, temp, leftStart, middle);
        mS(arr, temp, middle + 1, rightEnd);
        mergeHalves(arr, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {

        int leftEnd = (leftStart + rightEnd) / 2; 
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;  // a 4-value array 

        // points to manage comparison of values
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        // the point is to compare elements and add to temp []
        while(left <= leftEnd && right <= rightEnd) {

            if(arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++; 
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;

        }

        // now we append the remainder of the lists 
        System.arraycopy(arr, left, temp, index, (leftEnd - left) + 1);
        System.arraycopy(arr, right, temp, index, (rightEnd - right) + 1);

        // now we copy the contents of temp to the original array
        System.arraycopy(temp, leftStart, arr, leftStart, size);


    }

    public static void main(String[] args) {

        int[] a = {4,5,7,3,12,0,4,976,26};
        int[] b = new int[a.length];
        mS(a, b, 0, a.length - 1);

        for(int e : a) {
            System.out.println(e);
        }
    }
}