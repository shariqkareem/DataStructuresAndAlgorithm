package folder;/*
    {5,7,3,8,9,10,1}
 */

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers{
    public static void main(String[] args){
        String word1 = "hello";
        String word2 = "world";
        char[] lettersInWord1 = word1.toCharArray();
        char[] lettersInWord2 = word2.toCharArray();

        List<Character> lettersListInWord1 = new ArrayList<>();
        for(char letter : lettersInWord1){
            lettersListInWord1.add(letter);
        }

        for(char letter : lettersInWord2){
            if(lettersListInWord1.contains(letter))
                System.out.println(letter);
        }
    }
}