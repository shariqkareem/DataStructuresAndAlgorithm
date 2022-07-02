package searching;

import sorting.Utility;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] playerKitNums = Utility.fetchTestInput();
        Arrays.sort(playerKitNums);
        System.out.println("sorted input array ");
        for(int i =0;i< playerKitNums.length;i++){
            System.out.print(playerKitNums[i] + " ");
        }
        System.out.println();
        System.out.println(binarySearch(17, playerKitNums));
        System.out.println(binarySearch(99, playerKitNums));
        System.out.println(binarySearch(3, playerKitNums));
    }

    private static int binarySearch(int numToSearch, int[] playerKitNums){
        return recursiveBinarySearch(numToSearch, playerKitNums, 0, playerKitNums.length);
    }

    private static int recursiveBinarySearch(int numToSearch, int[] playerKitNums, int start, int end){
        if(start>=end)
            return -1;

        int mid = (start + end) / 2;
        if(numToSearch == playerKitNums[mid])
            return mid;
        else if(numToSearch < playerKitNums[mid])
            return recursiveBinarySearch(numToSearch, playerKitNums, start, mid);
        else
            return recursiveBinarySearch(numToSearch, playerKitNums, mid+1, end);

    }
}
