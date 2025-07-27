class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;

        if (nums.length < 3) {
            return 0;
        }

        int left = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (left < nums[i] && nums[i] > nums[i + 1]) {
                    count++;
                } else if (left > nums[i] && nums[i] < nums[i + 1]) {
                    count++;
                }
                left = nums[i];
            }
        }
        return count;
    }
}
