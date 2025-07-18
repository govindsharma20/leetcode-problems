class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long currentSum = 0;
        for(int i=0;i<k;i++){
            currentSum += nums[i];
        }
        long maxsum = currentSum;

        for(int i=k; i<nums.length;i++){
            currentSum = currentSum - nums[i - k] + nums[i];
            maxsum = Math.max(maxsum, currentSum);
        }
        return (double) maxsum / k;
    }

}
