import java.util.List;
public class Solution {
    public static void rec(int c,int[] ans,int x){
        if(c==x){
            return;
        }
        System.out.print("Coding Ninjas ");
        c++;
        rec(c,ans,x);
    }
    public static void printNtimes(int n){
        int c=0;
        int[] ans=new int[n];
        rec(c,ans,n);
    }
}
