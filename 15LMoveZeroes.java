// Using two pointer approach in same direction two pointers at the 
// starting position and moving according to the zero and non zero elements

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1 && nums.length==0){
            return;
        }
        int l=0;
        int h=0;
        while(h<nums.length){
            if(nums[h]!=0){
                int temp=nums[h];
                nums[h]=nums[l];
                nums[l]=temp;
                l++;
                h++;
            }
            else{
                h++;
            }
        }
    }
}
