/*Print whether the version is upgraded, downgraded or not changed
according to the input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded,
Input : Version1 4.9.2 Version2 4.8.4 Output: downgraded */
package ZohoQuestions;
public class Zoho7 {
    public static String versionCheck(String s1, String s2){
        String version = null;
        int ver1 = 0, ver2 = 0;
        for(int i=0; i<s1.length(); i++){

            if(s1.charAt(i) != '.'){
                ver1 = ver1 * 10 + (s1.charAt(i) - '0');
            }
            if(s2.charAt(i) != '.'){
                ver2 = ver2 * 10 + (s2.charAt(i) - '0');
            }
        }
        if(ver1 > ver2) version = "downgraded";
        else version = "upgraded";
        return version;
    }
    public static void main(String[] args) {
      String version1 = "1.5.34";
      String version2 = "1.3.34";
      String result = versionCheck(version1, version2);
      System.out.println("version 2 is "+result);
    }
}
