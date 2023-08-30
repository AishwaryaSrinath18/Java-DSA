public class Solution {
    public static long sumFirstN(long n) {
        long ans=0;
        for(int i=1;i<=n;i++){
            ans=ans+i;
        }
        return ans;
    }
}
