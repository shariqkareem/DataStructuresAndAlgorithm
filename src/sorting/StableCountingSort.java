package sorting;

import java.util.Arrays;

public class StableCountingSort {
    /*
        > Achieves stability by traversing the input array from R to L  and also writing back the values from R to L.
            So if there are 2 equal values, the right most value will get inserted first in the R followed by its equal value to its L
        > O(n)
        > This algo is used as a sub-algo in radix sort. So in this program we are sorting based on 10s position
     */
    public static void main(String[] args) {
        int[] input = Utility.fetchTestInputForRadixSort();
        /*
            1. Make a count array
            2. Modify the count array such that it stores the count of values equal to or less than the value instead of just equal to.
            3. Create a temp[input.length]
            4. Iterate inp[] from R to L
                >  Get the digit at the specifed ten's position, 10 in this example
                >  temp[--countArr[digit-min]] = input[i]
            5. Copy temp[] to inp[]
         */

        //Assumptions about input data
        int position = 2; // for this program, since we are sorting based on 100s place
        int radix = 10;

        StableCountingSort stableCountingSort = new StableCountingSort();
        input = stableCountingSort.doStableCountingSort(input, position, radix);
        Utility.printArray(input);
    }

    public int[] doStableCountingSort(int[] input, int position, int radix) {
        int[] countArr = new int[radix];
        // Prepare count array
        for(int i =0;i<input.length;i++){
            int valueAtDigit = input[i] / (int) Math.pow(10, position) % radix;
            countArr[valueAtDigit]++;
        }
        //Modify the count array
        for(int i=1;i<countArr.length;i++){
            countArr[i] += countArr[i-1];
        }
        // Create temp[]
        int[] temp = new int[input.length];

        // Insert values into temp[]
        for(int i=input.length -1;i>=0;i--){
            int valueAtDigit = input[i] / (int) Math.pow(10, position) % radix;
            temp[--countArr[(valueAtDigit)]] = input[i];
        }
        return temp;
    }
}
