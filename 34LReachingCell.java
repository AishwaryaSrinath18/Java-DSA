class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
       int xd=Math.abs(fx-sx), yd=Math.abs(fy-sy);
       if(xd==0 && yd==0 && t==1) return false;
       return Math.max(xd,yd)<=t;
    }
}
