package sorting;

/**
 * Bubbles the largest element to the top in each iteration ,  imagine the array to be vertical
 * O(n^2) quadratic
 * Stable sort
 * Too much swapping
 * In place algorithm
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] playerKitNumbers = Utility.fetchTestInput();
        /*
            > Logically partition the array into sorted , unsorted part
            > At first, every element is in the unsorted part , so the last index of unsorted part is the length of the array
            > Loop (L1)  through the unsorted part and compare each element to the element to its right
            > Swap if e[i] > e[i+1]
            > By the end of one iteration the largest number is moved to the right end of the unsorted part and that
                position now belongs to the sorted part.
            > Do L1 until unsorted part size becomes 0 . which means every element in the array is sorted

         */
        for(int unsortedPartIndex = playerKitNumbers.length -1;unsortedPartIndex > 0 ;unsortedPartIndex--){
            for(int i=0;i<unsortedPartIndex;i++){
                if (playerKitNumbers[i]> playerKitNumbers[i+1])
                    Utility.swap(playerKitNumbers, i, i+1);
            }
        }
        Utility.printArray(playerKitNumbers);
    }
}
