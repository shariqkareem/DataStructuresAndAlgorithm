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
        insertionSort(playerKitNumbers, 1);
        Utility.printArray(playerKitNumbers);
    }

    private static void insertionSort(int[] playerKitNumbers, int unsortedPartFirstIndex) {
        if (unsortedPartFirstIndex > playerKitNumbers.length-1)
            return;
        int valueToInsert = playerKitNumbers[unsortedPartFirstIndex];
        int indexToInsert;
        for (indexToInsert = unsortedPartFirstIndex; indexToInsert > 0; indexToInsert--) {
            if (valueToInsert < playerKitNumbers[indexToInsert - 1]) {
                playerKitNumbers[indexToInsert] = playerKitNumbers[indexToInsert - 1];
            } else {
                break;
            }
        }
        playerKitNumbers[indexToInsert] = valueToInsert;
        insertionSort(playerKitNumbers, unsortedPartFirstIndex + 1);
    }
}
