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
        System.out.println(binarySearchRecursive(playerKitNums, 0, playerKitNums.length, 17));
        System.out.println(binarySearchRecursive(playerKitNums, 0, playerKitNums.length, 99));
        System.out.println(binarySearchRecursive(playerKitNums, 0, playerKitNums.length, 3));
    }

    private static int binarySearchRecursive(int[] playerKitNumbers, int start, int end, int valueToSearch) {
        if(start>=end)
            return -1;

        int mid = (start + end) / 2;
        if(playerKitNumbers[mid] == valueToSearch)
            return mid;
        else if(playerKitNumbers[mid] > valueToSearch) {
            return binarySearchRecursive(playerKitNumbers, start, mid, valueToSearch);
        } else {
            return binarySearchRecursive(playerKitNumbers, mid + 1, end, valueToSearch);
        }
    }
}