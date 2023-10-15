//Using binary search and assigning l,h,m as low, high,mid values to 
// find sqrt

class Solution {
    public int mySqrt(int x) {
       if(x<=1) return x;
       long l=1;
       long h=x;
       long m=0;
       int ans=1;
       while(l<=h){
           m=l+(h-l)/2;
           if(m*m<=x){
               ans=(int)m;
               l=m+1;
           }
           else {
               h=m-1;
           }
       }
       return ans;
    }
}
