public class Solution {
    public static boolean palindromeNumber(int n){
        int temp=0;
        int rev=0;
        int a=n;
        while(n>0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        return(rev==a?true:false);
    }
}
