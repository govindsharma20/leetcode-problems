package leetcode;

/*Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

/* Leetcode submisson  

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int[] nextCharIndex = new int[128];
        int l = 0;

        for (int r = 0; r < n; r++) {
            char currentChar = s.charAt(r);
            int lastSeenPlusOne = nextCharIndex[currentChar];

            if (lastSeenPlusOne > l) {
                l = lastSeenPlusOne;
            }

            int currentLength = r - l + 1;
            if (currentLength > longest) {
                longest = currentLength;
            }

            nextCharIndex[currentChar] = r + 1;
        }

        return longest;
    }
}
*/

import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to find the length of the longest substring without repeating characters:");
        String inputString = scanner.nextLine();

        Solution solver = new Solution();
        int longestLength = solver.lengthOfLongestSubstring(inputString);

        System.out.println("The length of the longest substring without repeating characters is: " + longestLength);

        scanner.close();
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int[] nextCharIndex = new int[128];
        int l = 0;

        for (int r = 0; r < n; r++) {
            char currentChar = s.charAt(r);
            int lastSeenPlusOne = nextCharIndex[currentChar];

            if (lastSeenPlusOne > l) {
                l = lastSeenPlusOne;
            }

            int currentLength = r - l + 1;
            if (currentLength > longest) {
                longest = currentLength;
            }

            nextCharIndex[currentChar] = r + 1;
        }

        return longest;
    }
}
