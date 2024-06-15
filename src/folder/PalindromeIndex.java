package folder;

import java.util.Scanner;

public class PalindromeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of tests ");
        int numberOfStrings = sc.nextInt();
        String[] strings = new String[numberOfStrings];
        for(int i = 0;i<numberOfStrings;i++){
            System.out.println("Enter String ");
            strings[i] = sc.next();
            System.out.println(checkPalindromeIndex(strings[i]));
        }
    }

    private static int checkPalindromeIndex(String s) {
        int palindromeIndex = checkPalindrome(s);
        if (palindromeIndex == -1)
            return palindromeIndex;
        else if (checkPalindrome(removeCharacterAt(palindromeIndex, s)) == -1) {
            return palindromeIndex;
        } else if (checkPalindrome(removeCharacterAt(s.length()-(palindromeIndex+1), s)) == -1){
            return s.length()-(palindromeIndex+1);
        } else{
            return -1;
        }
    }

    private static String removeCharacterAt(int palindromeIndex, String s) {
        StringBuilder newStringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i!=palindromeIndex) {
                newStringBuilder.append(s.charAt(i));
            }
        }
        return newStringBuilder.toString();
    }

    private static int checkPalindrome(String s){
        int palindromeIndex = -1;
        StringBuilder reversedCharsStringBuilder = new StringBuilder();
        String reversedString = "";
        for(int i=s.length()-1;i>=0;i--){
            reversedCharsStringBuilder.append(s.charAt(i));
        }
        reversedString = reversedCharsStringBuilder.toString();

        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=reversedString.charAt(i)){
                palindromeIndex = i;
                break;
            }
        }
        return palindromeIndex;
    }
}
