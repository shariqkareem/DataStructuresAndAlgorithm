package folder;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> paranthesesCombos = generateParentheses(n);
        paranthesesCombos.forEach(System.out::println);
    }

    private static List<String> generateParentheses(int n){
        List<String> combinations  = new ArrayList<>();
        generateParanthesisRecursively(combinations, n, 0,0, "");
        return combinations;
    }

    private static void generateParanthesisRecursively(List<String> combinations, int n, int openingCount, int closingCount, String combination) {
        if(combination.length() == 2*n){
            combinations.add(combination);
            return;
        }
        if(openingCount<n){
            generateParanthesisRecursively(combinations, n, openingCount+1, closingCount, combination + "(");
        }
        if(closingCount<openingCount){
            generateParanthesisRecursively(combinations, n, openingCount, closingCount+1, combination+")");
        }
    }
}
