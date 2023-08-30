public class Solution{   
    public static void rec(int c,int[] ans,int x){
    if(x==c){
        return;
    }
    ans[c]=x-c;
    c++;
    rec(c,ans,x);
}
    public static int[] printNos(int x) {
        int c=0;
        int[] ans=new int[x];
        rec(c,ans,x);
        return ans;
    }
}
