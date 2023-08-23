public class Solution {
    public static int countDigits(int n){
     int count=0;
     int num=n;
     while(n>0){
     int temp=n%10;
     if(temp!=0 && num%temp==0){
         count++;
     }
     n=n/10;
     }
     return count;
    }
}
