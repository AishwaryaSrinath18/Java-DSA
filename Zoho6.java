/*. Remove the duplicates in the String.
Testcase 1: Input: Java1234 Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2: Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
Testcase 3: Input: aBuzZ9900 Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String.
Replace with capital C as the letter to be replaced is capital Z.
The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)
*/
package ZohoQuestions;

import java.util.ArrayList;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Duplicate6 {
    public static StringBuilder changeDuplicate(String str){
        StringBuilder resStr = new StringBuilder();
        ArrayList list = new ArrayList();
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                char x = str.charAt(i);
                while (list.contains(Character.toLowerCase(x)) || list.contains(Character.toUpperCase(x))) {
                    if (x == 'z') {
                        x = 'a'; // changing z to a as a loop
                        continue; // since changed, moving the loop for next iteration
                    }
                    if (x == 'Z') {
                        x = 'A';
                        continue;
                    }
                    x++;
                }
                list.add(x);
            }
            else{
                int x = (int)str.charAt(i) - 48; // to get the integer value in that place
                while(list.contains(x)){
                    if(x == 9){
                        x = 0; // changing 9 to 0, to make it a loop
                        continue; // as incremented the value, moving to next value
                    }
                    x++;
                }
                list.add(x);
            }
        }
        for(int i=0;i<list.size();i++){
            resStr.append(list.get(i));
        }
        return resStr;
    }
    public static void main(String[] args) {
        String str = "Java9900";
        String result = String.valueOf(changeDuplicate(str));
        System.out.println(result);
    }
}
