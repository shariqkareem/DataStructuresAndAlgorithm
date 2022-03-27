package sorting;

public class RadixSortWords {
    public static void main(String[] args) {
        String[] stringsArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort
        int radix = 26;
        int width = 5;

        stringsArray = radixSort(stringsArray, radix, width);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    private static String[] radixSort(String[] stringsArray, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            //Prepare count array
            int[] countArray = new int[radix];
            for (int j = 0; j < stringsArray.length; j++) {
                countArray[stringsArray[j].charAt(i) - 'a']++;
            }
            //Modify the count array
            for (int j = 1; j < countArray.length; j++) {
                countArray[j] += countArray[j - 1];
            }
            // create temp array and write values into it
            String[] temp = new String[stringsArray.length];
            for (int j = stringsArray.length - 1; j >= 0; j--) {
                temp[--countArray[stringsArray[j].charAt(i) - 'a']] = stringsArray[j];
            }

            stringsArray = temp;
        }
        return stringsArray;
    }
}
