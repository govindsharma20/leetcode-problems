package leetcode;

/*   LONBEST PALINDROME SUBSTRING

Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */


 /* LEETCODE SOLUTION

 class Solution {
    private int maxLength = 0;
    private int start = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int currentLength = right - left - 1;

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = left + 1;
        }
    }
}
  */

import java.util.Scanner; 

public class string5 {

    private int maxLength = 0;
    private int start = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int currentLength = right - left - 1;

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = left + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a string: "); 
        String userInput = scanner.nextLine(); 

        string5 solver = new string5();
        String result = solver.longestPalindrome(userInput);

        System.out.println("The longest palindromic substring is: " + result);

    }
}