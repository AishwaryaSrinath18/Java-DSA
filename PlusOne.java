class Solution {
    public int[] plusOne(int[] digits) {
       for(int i=digits.length-1;i>=0;i--){  // Iterating from the last digit of the array checking if it 9 making it as zero going to the element before iif it not 9 adding 1
           if(digits[i]<9){
               digits[i]=digits[i]+1;
               return digits;
           }
           digits[i]=0;
       }
       int[] digit=new int[digits.length+1];
       digit[0]=1;
       return digit;
    }
}
