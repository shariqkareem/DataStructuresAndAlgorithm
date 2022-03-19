package sorting;

public class QuickSort {
    /*
        > Uses a pivot element and moves element < pivot to left of pivot, and those > pivot to right of pivot
        > Divide and conquer strategy
        > Recursive algo
        > In-place sorting algo
        > Mostly O (n log n) and usually performs better than merge sort, worst case it is quadratic O(n^2)
        > Useful for sorting arrays with large number of elements
     */

    public static void main(String[] args) {
        int[] playerKitNums = Utility.fetchTestInput();
        partitionAndSort(playerKitNums, 0, playerKitNums.length);
        Utility.printArray(playerKitNums);
    }

    private static void partitionAndSort(int[] array, int start, int end){
    /*
      > Recursive method. base case : end - start ==1
      > Choose pivot element - the starting element of the array
      > Traverse the array from right and left alternatively
          > while traversing from R to L if array[j] < pivot, move array[j] to array[i]
          > while traversing from L to R if array[i] > pivot, move array[i] to array[j]
      > when i crosses j, insert the pivot element at position j
      > Recursively call sort() with the left partion - start to pivot
      > Recursively call sort() with the right partion - pivot+1 to end
   */
        if(end - start < 2)
            return;

        int pivot = array[start];
        int i = start;
        int j = end;
        while(i<j){
            while(i<j && array[--j]>=pivot);
            if(i<j){
                array[i] = array[j];
            }
            while(i<j && array[++i]<=pivot);
            if(i<j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;

        partitionAndSort(array, start, j);
        partitionAndSort(array, j+1, end);
    }
}
