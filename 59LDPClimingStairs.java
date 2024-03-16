// Problem is resembling fibonacci sequence 1,1,2,3,5,8,13,...
// here we use dp logic to solve the problem
// bottom to top model, Time and space complexity: O(n)
// using recursion will have time limit exceeding problem 
// O(2^n) complexity
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        // array to store no of ways to reach steps
        // no of ways to reach ground is 1
        dp[0] = 1; // ground
        dp[1] = 1; // ways to reach first step
        for(int i=2; i<dp.length; i++) dp[i] = dp[i-1] + dp[i-2];
        // fibonacci series
        return dp[dp.length -1];
    }
}


// this can also be solved using only one space 
class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int sum = 0;
        while(n > 1){
            sum = sum + a + b;
            a = b;
            b = sum;
            n--;
        } 
        return sum;
    }
}
