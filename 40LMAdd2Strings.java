/*Approach:

m and n points the last index value of the strings
String Builder set is to collect the answer
carry is used to carry the tenth digit of adding two numbers
since carry is integer, subtracting two characters(ascii value) we get an integer
So we subtract character '0' with ascii value 48 and we get the required integer
Ascii value of 1 is: 49
48-49=1
Return the string by coverting string builder to string*/


class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length()-1;
        int n=num2.length()-1;
        int carry=0;
        StringBuilder sb= new StringBuilder();
        while(m>=0 || n>=0 || carry>0){
            if(m>=0){
                carry += num1.charAt(m) - '0';
                m--;
            }
            if(n>=0){
                carry += num2.charAt(n) - '0';
                n--;
            }
            sb.insert(0,carry%10);
            carry /= 10;
        }
        return sb.toString();
    }
}
