class Solution {
    public String mergeAlternately(String word1, String word2) {
        int pnt1 = 0, pnt2 = 0;
        String mergedString = "";
        while(pnt1<word1.length() || pnt2<word2.length()){
            if(pnt1<word1.length()) mergedString = mergedString + word1.charAt(pnt1);
            if(pnt2<word2.length()) mergedString = mergedString + word2.charAt(pnt2);
            pnt1++; pnt2++;
        }
        return mergedString;
    }
}
