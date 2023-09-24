// Using two pointers in opposite direction.
// first is low and last element is high and a pointer i starting from the last position to the first one to enter the numbers in the reverse order. 

class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[l]>nums[h]){
                arr[i]=nums[l];
                l++;
            }
            else{
                arr[i]=nums[h];
                h--;
            }
        }
        return arr;
    }
}
