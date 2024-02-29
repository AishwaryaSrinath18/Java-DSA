package ZohoQuestions;
/*Sample Input: Hacker  Rank
Sample Output:  Hce akr , Rn ak
Print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line
*/
public class Zoho11 {
    public static void main(String[] args) {
        String s1 = "Hacker";
        String s2 = "Ranks";
        splitWords(s1);
        splitWords(s2);
    }
    private static void splitWords(String s1) {
        for(int i=0; i<s1.length(); i++){
            if(i%2 == 0 ) System.out.print(s1.charAt(i));
        }
        System.out.print(" ");
        for(int i=0; i<s1.length(); i++){
            if(i%2 != 0 ) System.out.print(s1.charAt(i));
        }
        System.out.println();
    }
}
