//Moving even integers front and odd integers back

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[pos];
                nums[pos]=nums[i];
                nums[i]=temp;
                pos++;
            }
        }
        return nums;
    }
}
