class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int sumn=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
           sumn=sumn+nums[i];
        }
        sum=(n*(n+1))/2;
        int res=sum-sumn;
        return res;
    }
}
// Calculating the total sum of first n atural numbers and subtracting from the sum of the array.
