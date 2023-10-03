class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length<3){return nums[0]; }
       Arrays.sort(nums);
       int n=nums.length/2 ;
       return nums[n];
    }
}
