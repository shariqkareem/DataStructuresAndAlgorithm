package sorting;

public class MergeSort {
    /*
        > Divide and conquer strategy
        > Recursive algo
        > Stable sort
        > Not an in-place sort algo
        > O(n log n)
     */
    public static void main(String[] args) {
        int[] playerKitNums = Utility.fetchTestInput();
        /*
            > Recursively split the array into halves (L and R) until we have one element arrays. A One element array is a sorted array.
            > Cross compare the sorted L and R arrays and merge them by creating a temp array
            > Copy the values of temp array which has sorted elements of L and R into the main array.
            >
         */
        splitArrayAndMerge(playerKitNums, 0, playerKitNums.length);
        Utility.printArray(playerKitNums);
    }

    public static void splitArrayAndMerge(int[] array, int start, int end) {
        if(end-start==1)
            return;
        int mid = (start + end)/2;
        splitArrayAndMerge(array, start, mid);
        splitArrayAndMerge(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        /*
            > We have recieved an array which is logically partitioned into L and R
            > int[] tempArray = new int[start + end];
            > Cross compare the elements of L array with R array and copy the smallest value to temp array.
            > tempArrayIndex++;
            > For optimization (o1) when the last element of L > 1st elememt of R, avoid cross compare, because L and R are sorted arrays.
         */
        if(array[mid-1] < array[mid]) // o1
            return;

        int[] tempArray = new int[start + end];
        int i=start, j=mid, tempArrayIndex = 0;
        // cross compare and add to temp array in sorted order.
        while(i < mid && j<end){
            tempArray[tempArrayIndex] = (array[i] < array[j]) ? array[i++] : array[j++];
            tempArrayIndex++;
        }
        // copy temp array values to main array
        System.arraycopy(array, i, array, start + tempArrayIndex, mid-i); // shifts the left over elements from L array to the last of the partition
        System.arraycopy(tempArray, 0, array, start, tempArrayIndex); // using temp index for number of values to be copied instead of tempArray.length because temp array may not be filled
    }
}
