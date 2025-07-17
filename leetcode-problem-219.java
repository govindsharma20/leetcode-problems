class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> temp = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(temp.contains(nums[i])){
                return true;
            }
            temp.add(nums[i]);

            if(i >= k){
                temp.remove(nums[i - k]);
            }
        }
        return false;
    }
}
