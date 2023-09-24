// Using two pointer the first height is l and the last is h
// two possiblities l<h and l>h and finding the maximum water stored by 
//comparing the storage of all 
// the water is calculated by the index of right-left * min height.

class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int l=0;
        int h=height.length-1;
        while(l<h){
           water=Math.max(water, Math.min(height[l],height[h])*(h-l));
           if(height[l]<height[h]) l++;
           else h--;
        }
        return water;
    }
}
