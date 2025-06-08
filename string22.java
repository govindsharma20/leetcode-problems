package leetcode;

/*  GENERATE PARENTHESIS

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:

Input: n = 1
Output: ["()"]
 */

/* LEETCODE SOLUTION
 class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String currentString, int openCount, int closeCount, int n) {
        if (currentString.length() == 2 * n) {
            result.add(currentString);
            return;
        }

        if (openCount < n) {
            backtrack(result, currentString + "(", openCount + 1, closeCount, n);
        }

        if (closeCount < openCount) {
            backtrack(result, currentString + ")", openCount, closeCount + 1, n);
        }
    }
}
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class string22 {
    List<String> allCombinations;
    int maxPairs;

    public List<String> generateParenthesis(int n) {
        allCombinations = new ArrayList<>();
        maxPairs = n;
        generate("", 0, 0);
        return allCombinations;
    }

    private void generate(String current, int openCount, int closeCount) {
        if (current.length() == 2 * maxPairs) {
            allCombinations.add(current);
            return;
        }

        if (openCount < maxPairs) {
            generate(current + "(", openCount + 1, closeCount);
        }

        if (closeCount < openCount) {
            generate(current + ")", openCount, closeCount + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        string22 solution = new string22();
        List<String> result = solution.generateParenthesis(n);

        for (String s : result) {
            System.out.println(s);
        }
    }
}