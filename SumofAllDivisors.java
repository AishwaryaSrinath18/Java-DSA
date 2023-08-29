public class Solution {
    public static int sumOfAllDivisors(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
              if(i%j==0){
                  ans+=j;
              }
            }
        }
        return ans;
    }
}
