class Solution {
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            int rightsum = totalSum - leftsum - nums[i];

            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
        
    }
}
