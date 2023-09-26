//Using two pointer approach to check the palindrome
//First to convert the given string to lowercase letters including changing spaces and symbols.

class Solution {
    public boolean isPalindrome(String s) {
        boolean ans=false;
       String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
       if(actual.length()==0 || actual.length()==1){return true;}
       int l=0;
       int h=actual.length()-1;
       while(l<h){
           if(actual.charAt(l)==actual.charAt(h)){
               h--;
               l++;
               ans=true;
           }
           else {
               ans=false;
               break;
           }
       }
       return ans;
    }
}
