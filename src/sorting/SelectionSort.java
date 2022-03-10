package sorting;

/**
 * Selects the largest element in the unsorted part
 *      and keeps track of its index and swaps it with the element at last index of the unsorted part in every iteration
 * O(n^2) quadratic
 * Unstable sort
 * Fewer swapping than bubble sort
 * In place algorithm
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] playerKitNumbers = Utility.fetchTestInput();

        /*
         * > Logically partition the array into sorted and unsorted parts
         * > Initially every element in the array belongs to the unsorted part
         * > Assume the largest element in the array is at index 0 . Track the index of the largest element
         * > Loop (L1) through the unsorted part starting from index 1
         * > if array[i] > largest , set largest to i
         * > By the end of first iteration of L1 , we know the index where the largest element of the array is present.
         * > Swap the value at the last index of the unsorted part with the index stored in largest
         * > Repeat L1 until unsorted part size becomes 0
         */

        for(int unsortedPartIndex = playerKitNumbers.length -1 ; unsortedPartIndex > 0; unsortedPartIndex--){
            int largest = 0;
            for(int i=1;i<=unsortedPartIndex;i++){
                if(playerKitNumbers[i]>playerKitNumbers[largest]){
                    largest = i;
                }
                //System.out.println(largest);
                Utility.swap(playerKitNumbers, largest, unsortedPartIndex);
            }
        }
        Utility.printArray(playerKitNumbers);
    }
}
