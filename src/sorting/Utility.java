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

    public static void printArray(int[] playerKitNumbers){
        for (int playerKitNumber : playerKitNumbers) {
            System.out.println(playerKitNumber);
        }
    }
}
