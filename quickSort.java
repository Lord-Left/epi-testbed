public class quickSort {

    public static void main(String[] args) {
        int[] test = {0,2,1,4,3,6,5,6,7,9}; // unsorted test array
        
        for(int x: test) {
            System.out.print(x);
        }

        qS(test, 0, test.length-1);
        System.out.println();
        for(int x: test) {
            System.out.print(x);
        }

    }

    public static void qS(int[] arr, int leftStart, int rightEnd) {

        if (leftStart >= rightEnd) {
            return;
        }

        int pivot = rightEnd;
        int left = leftStart;
        int right = rightEnd - 1;

        while(left <= right) {
            

            if(arr[left] > arr[pivot] && arr[right] < arr[pivot]) {
                 int temp = arr[left];
                 arr[left] = arr[right];
                 arr[right] = temp;
            } else if (arr[left] < arr[pivot]) {
                left++;
            } else if (arr[right] > arr[pivot]) {
                right--;
            }

        }

        
        int temp = arr[left];
        arr[left] = arr[pivot];
        arr[pivot] = temp;

        // now perform for sub arrays!
        qS(arr, leftStart, left-1);
        qS(arr, left+1, rightEnd);
    }
}