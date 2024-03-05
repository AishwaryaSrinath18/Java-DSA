package ZohoQuestions;
/* First Occurrences Given two strings, find the first occurrence of all characters of second string in the first string
and print the characters between the least and the highest index
I/P: ZOHOCORPORATION PORT O/P: OHOCORPORAT Explanation:
The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
So print the characters of the first string in this inex range i.e. OHOCORPORAT*/
public class Zoho33 {
    public static void main(String[] args) {
        String answer = printWithinRange("ZOHOCORPORATION", "POR");
        System.out.println(answer);
    }
    private static String printWithinRange(String s1, String s2) {
        int min = s1.length(); // if it is 0, 0 will be minimum so keeping it as the length
        int max = -1; // Any number greater than -1 will be of the index
        for(int i=0; i<s2.length(); i++){
            for(int j=0; j<s1.length(); j++){
                min = Math.min(s1.indexOf(s2.charAt(i)), min); // to get the first occurrence of the char 
                max = Math.max(s1.indexOf(s2.charAt(i)), max); 
            }
        }
        return s1.substring(min, max+1);
    }
}
