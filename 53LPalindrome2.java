// for example if there is a word abceba, here if we take c it will become palindrome
// so in the isPalindrome function will check only the specific elements like 
// here left will be in c and right will be in e
// so for checking it will check from left+1 i.e., e so it is palindrome


class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 1) return true;
        // two pointers
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            //Checking palindrome
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
            //eliminating a element and checking palindrome
            return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            }            
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
