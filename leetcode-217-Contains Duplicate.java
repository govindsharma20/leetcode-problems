/* LEETCODE 217 CONTAINS DUPLICATE
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.
 */

 class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    
    }
}