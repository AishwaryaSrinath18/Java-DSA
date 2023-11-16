/*Given a string S that contains 3 words and a query string q:
Here similarity between two words is defined as comparing consequent two words of query to strings in S
and counting their similarity,
Return the string in S with maximum similarity
Example: String S=['hello','hey','yellow'] and query q=hell
Output: hello
Explanation: hello have 3 similarities like he,el,ll with q
             hey have 1 similarity he with q
             yellow have 2 similarities like el,ll with q
*/

import java.util.Scanner;

class Length{
    public int findSimilarWord(String[] s, String q){
        int index=0; // index of the string having maximum count
        int count=0; // similarity count of each string in s
        int curCount=0; // to find the maximum count
        for(int i=0;i<s.length;i++){
            count=0;
            for(int j=0;j<s[i].length()-1;j++){
                for(int k=0;k<q.length()-1;k++){
                    if(q.charAt(k)==s[i].charAt(j) && q.charAt(k+1)==s[i].charAt(j+1)) count++;
                }
            }
            if(curCount<count){
                curCount=count;
                index=i;
            }
        }
        return index;
    }
}

public class Similarity {
    public static void main(String args[]){
        System.out.print("Length of the string array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int x=0;x<n;x++){
            s[x]=sc.next();
        }
        System.out.print("Query string Q:");
        String q=sc.next();
        Length l=new Length();
        System.out.println("");
        int index=l.findSimilarWord(s,q);
        System.out.print("The most similar words with query q is: ");
        System.out.println(s[index]);
    }
}
