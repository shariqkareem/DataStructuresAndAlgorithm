package sorting;

public class Utility {
    public static void swap(int[] playerKitNumbers, int i, int j) {
        int temp = playerKitNumbers[i];
        playerKitNumbers[i] = playerKitNumbers[j];
        playerKitNumbers[j] = temp;
    }

    public static int[] fetchTestInput(){
        int[] playerKitNumbers = new int[7];
        playerKitNumbers[0] = 40;
        playerKitNumbers[1] = -9;
        playerKitNumbers[2] = 11;
        playerKitNumbers[3] = 13;
        playerKitNumbers[4] = 3;
        playerKitNumbers[5] = -15;
        playerKitNumbers[6] = 17;

        return playerKitNumbers;
    }

    public static int[] fetchTestInputForCountingSort(){
        int[] playerKitNumbers = new int[7];
        playerKitNumbers[0] = 40;
        playerKitNumbers[1] = 5;
        playerKitNumbers[2] = 11;
        playerKitNumbers[3] = 13;
        playerKitNumbers[4] = 3;
        playerKitNumbers[5] = 5;
        playerKitNumbers[6] = 17;

        return playerKitNumbers;
    }

    public static int[] fetchTestInputForRadixSort(){
        int[] playerKitNumbers = new int[6];
        playerKitNumbers[0] = 1330;
        playerKitNumbers[1] = 8792;
        playerKitNumbers[2] = 1594;
        playerKitNumbers[3] = 4725;
        playerKitNumbers[4] = 4586;
        playerKitNumbers[5] = 5729;

        return playerKitNumbers;
    }

    public static void printArray(int[] playerKitNumbers){
        for (int playerKitNumber : playerKitNumbers) {
            System.out.println(playerKitNumber);
        }
    }
}
