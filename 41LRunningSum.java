class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
           // Each sum is sum of its and the previous terms
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
