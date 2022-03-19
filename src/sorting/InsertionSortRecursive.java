package sorting;

/**
 * Inserts element from the unsorted part (right) to the sorted part (left)
 * Stable sort
 * In place algo
 * quadratic O(N^2)
 */
public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] playerKitNumbers = Utility.fetchTestInput();
        /* Algorithm
            > Logically partition the array into sorted (left) and unsorted (right) parts .
            > Initially the first element of the array is in the sorted part , rest are in unsorted part
            > Loop (l1) the unsorted part and take the first element u1 from the unsorted part
                > insert u1 it to the sorted part .
                > Loop (l2) the sorted part from right to left . At first iteration of L2 , the element at sortedPart[i] is u1
                    > if sortedPart[i] < sortedPart[i-1] , move sorted[i-1] to sorted[i] position .
                    > else break L2
                > By end of L2 , the value we have for i is the index in which u1 should be inserted
            > By end of L1 the array is sorted.
         */
        insertionSort(playerKitNumbers, 1);
        Utility.printArray(playerKitNumbers);
    }

    private static void insertionSort(int[] playerKitNums, int position) {
        if (position >= playerKitNums.length)
            return;
        int elementToInsert = playerKitNums[position];
        int i;
        for (i = position; i > 0; i--) {
            if (elementToInsert < playerKitNums[i - 1]) {
                playerKitNums[i] = playerKitNums[i - 1];
            } else {
                break;
            }
        }
        playerKitNums[i] = elementToInsert;
        insertionSort(playerKitNums, position + 1);
    }
}
