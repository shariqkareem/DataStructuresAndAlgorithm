package sorting;

public class CountingSort {
    /*
        > Makes assumption about the data. This algo can be used when we know that the data will be in a given range of values
        > Linear algo O(n)
        > Not an in place algo. Creates a counting array with size enough to hold all values from minimum to maximum elememt
        > Unstable algo. Can be made stable
     */
    public static void main(String[] args) {
        int[] playerKitNums = Utility.fetchTestInputForCountingSort();
        //Assumptions about input data
        int max = 40;
        int min = -15;

        int[] countingArray = new int[max-min+1];

        for(int i=0;i< playerKitNums.length;i++){
            countingArray[playerKitNums[i]-min]++;
        }
        int i=0;
        for(int j=0;j<countingArray.length;j++) {
            while(countingArray[j]-- > 0){
                playerKitNums[i++] = j+min;
            }
        }
        Utility.printArray(playerKitNums);
    }

}
