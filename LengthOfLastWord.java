class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && count==0){
                count=0;
            }
            else if(s.charAt(i)==' ' && count!=0){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
// Iterating the loop from the last element: if it has space skip to the previous one else count till the next space
// return count
