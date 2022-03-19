package sorting;

public class RadixSort {
    /*
         > Makes assumption about the input data
         > All values must have the same radix and width . Example : 4729 , 1532,8700
            Here the width of each element is 4, the radix is 10 because each digit can be from 0 to 9 . In case of letters, the radix is 26 A to Z
            Radic definition : Number of unique values that a system can have. For example 10 for decimal system , 2 for binary system, 26 for letters
         > O(n)
         > Stable sort because it uses stable counting sort.
         > Radix sort cannot be used for float values because the decimal point isn't a digit . I think we can exclude the "." to sort float.
     */
    public static void main(String[] args) {
        int[] input = Utility.fetchTestInputForRadixSort();
        /*
            > Perform stable counting sort for each element in the width starting from least significant to most significant i.e L to R
         */
        //Assumptions about input data
        int width = 4;
        int radix = 10;

        StableCountingSort stableCountingSort = new StableCountingSort();

        for(int i = 0;i<width;i++){
            input = stableCountingSort.doStableCountingSort(input, i, radix);
        }

        Utility.printArray(input);
    }
}
