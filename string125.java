package leetcode;

/*  VALID PALINDROME


A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise. 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/

/* LEETCODE SUBMISSION
class Solution {
    public boolean isPalindrome(String s) {
        char[] tempCleanedChars = new char[s.length()];
        int cleanIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean isAlphanumeric = false;
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                isAlphanumeric = true;
            }

            if (isAlphanumeric) {
                if (c >= 'A' && c <= 'Z') {
                    c = (char) (c - 'A' + 'a');
                }
                tempCleanedChars[cleanIndex++] = c;
            }
        }

        char[] cleanedChars = new char[cleanIndex];
        for (int i = 0; i < cleanIndex; i++) {
            cleanedChars[i] = tempCleanedChars[i];
        }

        int left = 0;
        int right = cleanIndex - 1;

        while (left < right) {
            if (cleanedChars[left] != cleanedChars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
 */

import java.util.Scanner;

public class string125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(s);
        System.out.println(result);
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        char[] tempCleanedChars = new char[s.length()];
        int cleanIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean isAlphanumeric = false;
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                isAlphanumeric = true;
            }

            if (isAlphanumeric) {
                if (c >= 'A' && c <= 'Z') {
                    c = (char) (c - 'A' + 'a');
                }
                tempCleanedChars[cleanIndex++] = c;
            }
        }

        char[] cleanedChars = new char[cleanIndex];
        for (int i = 0; i < cleanIndex; i++) {
            cleanedChars[i] = tempCleanedChars[i];
        }

        int left = 0;
        int right = cleanIndex - 1;

        while (left < right) {
            if (cleanedChars[left] != cleanedChars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}