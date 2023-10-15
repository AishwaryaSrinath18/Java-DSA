// Using binary search

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long l=1;
        long h=num;
        long m=0;
        boolean ans=false;
        while(l<=h){
            m=l+(h-l)/2;
            if(m*m==num){
                return true;
            }
            else if(m*m<num){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return false;
    }
}
