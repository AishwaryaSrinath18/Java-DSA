class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
       int first = 0, second = 0;
       while(first < s.length() && second<t.length()){
        if(s.charAt(first) != t.charAt(second)) {
            second++;
        }
        else if(s.charAt(first) == t.charAt(second)) {
            first++;   
            second++;
        }
        if(first == s.length()) return true;
       }
       return false;
    }
}
//Input: s = "abc", t = "ahbgdc"
//Output: true
