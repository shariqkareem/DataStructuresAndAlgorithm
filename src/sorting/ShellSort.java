package sorting;

/*
    > Variation of insertion sort
    > When an array is almost sorted, insertion sort only takes a few number of steps. It is almost O(n)/.
     So the goal of shell sort is to make the array almost sorted by doing some few preliminary steps.
    > Insertion sort takes element from unsorted part and compares with its neighbour in the sorted part . Gap value is 1
    > Shell sort improves this algo by having a larger gap value i.e. comparing with elements that are farther left
    > So this reduces the number of shifting to be done
    > The gap value is crucial for the performance of this algo
    > Common way for determining gap value is using Knuth sequence ---> gap value = (3^k -1) / 2 where k is calculated
     such that gap value < array.length
     > Better way / this tutorial suggested way is gap value = array.length / 2 first, then gap value = gap value /2 for
     every iteration
     > When gap value becomes 1, we are basically doing an insertion sort, but we'd have already done some preliminary sorting
     in the previous iterations using the large gap
     > Since the array is better sorted now, the insertion sort can easily sort it in fewer number of steps.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] playerKitNumbers = Utility.fetchTestInput();

    /*
        > gapV = playerKitNumbers.length / 2
        while(gapV > 0) {
        > L1 - >  for(i = gapV ; i < playKitNums.length; i++) {
            > u1 = playKitNums[i];
            > L2 --> for (j = i; j > 0; j = j-gap) {
            > if(u1 < playKitNums[(j-gap)])
                 playKitNums[i] = playKitNums[(j-gap)];
              else
                break;
            }
              playKitNums[j] = u1;
          }
          gapV = gaV / 2;
        }

     */

        int gapValue = playerKitNumbers.length / 2;
        while (gapValue > 0) {
            for (int i = gapValue; i < playerKitNumbers.length; i++) {
                int u1 = playerKitNumbers[i];
                int j;
                for (j = i; j >= gapValue; j = j - gapValue) {
                    if (u1 < playerKitNumbers[j - gapValue])
                        playerKitNumbers[j] = playerKitNumbers[j - gapValue];
                    else
                        break;
                }
                playerKitNumbers[j] = u1;
            }
            gapValue = gapValue/2;
        }

        Utility.printArray(playerKitNumbers);
    }
}
