class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int i=1;
        int count=0; //Counting number of rows
        while(n>=i){ 
            n=n-i;
            if(n<0) return count; //To return only the unfilled rows
            i++;
            count++;
        }
        return count;
    }
}
