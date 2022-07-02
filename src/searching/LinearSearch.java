package searching;

import sorting.Utility;

public class LinearSearch {
    public static void main(String[] args) {
        int[] playerKitNumbers = Utility.fetchTestInput();

        System.out.println(linearSearch(3, playerKitNumbers));
        System.out.println(linearSearch(100, playerKitNumbers));
        System.out.println(linearSearch(17, playerKitNumbers));
    }

    private static int linearSearch(int numberToSearch, int[] playerKitNums){
        for(int i =0;i< playerKitNums.length;i++){
            if(playerKitNums[i]==numberToSearch){
                return i;
            }
        }

        return -1;
    }
}
