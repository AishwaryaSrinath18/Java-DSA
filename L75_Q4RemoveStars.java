// Input:  "leet**cod*e"
// Output: "lecoe"
// to remove start and its left most element

class Solution {
    public String removeStars(String s) {
       String removed = "";
        int index = 0; // stack index
        char[] stack = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '*'){
                stack[index] = s.charAt(i);
                index++;
            }
            else{
                index--; // moving index to the left one and making it null
                stack[index] = '\u0000'; // null character
            }
        }
        for(int i=0; i<stack.length; i++){
            if(stack[i] != '\u0000') removed = removed + stack[i];
        }
        return removed;
    }
}
