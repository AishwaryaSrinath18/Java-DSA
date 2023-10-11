// Using binary search considering l,h,m as low, mid,high and finding target

class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int m=0;
        while(h>=l){
            m=(l+h)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) h=m-1;
            else l=m+1;
        }
        return -1;
    }
}
