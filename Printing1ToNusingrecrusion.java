public class Solution {
    public static void recc(int c,int[] ans,int x){
        if(x==c){
            return;
        }
        ans[c]=c+1;
        c++;
        recc(c,ans,x);
    }
    public static int[] printNos(int x) {
        int c=0;
        int[] ans=new int[x];
        recc(c, ans, x);
        return ans;
    }
}
