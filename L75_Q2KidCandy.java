class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = candies[0];
        for(int i=1; i<candies.length; i++){
            if( Math.max(max, candies[i]) == candies[i])  max = candies[i];
        }
        for(int i=0; i<candies.length; i++){
            if(extraCandies+candies[i] >= max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}
