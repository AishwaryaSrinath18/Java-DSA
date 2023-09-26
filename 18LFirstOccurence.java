// Using two pointers as h for haystack and n for needle
// if the first characters of the hs and n is equal then the loop starts at h=i and n=0 if the first word is equal then it will iterate with the 
//while loop till the condition get failed.

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int h=i;
                int n=0;
                while(h<haystack.length() && n<needle.length() && 
                needle.charAt(n)==haystack.charAt(h)){
                    n++;
                    h++;
                    if(n==needle.length()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
