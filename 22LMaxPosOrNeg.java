class Solution {
    public int maximumCount(int[] nums) {
        int l=0;
        int h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                l++;
            }
            else if(nums[i]>0){
                h++;
            }
        }
        return Math.max(h,l);
    }
}
