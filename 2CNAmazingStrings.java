import java.util.Arrays;
public class Solution {
// Given 3 strings whether 3rd contains both 1 and 2 and not any extra in it
	
	public static void answer(String s1,String s2,String s3)
	{	String combined = s1.concat(s2);
	    char str3[] = s3.toCharArray();
		char comStr[] = combined.toCharArray();
		Arrays.sort(comStr);
		Arrays.sort(str3);
		if(Arrays.equals(str3, comStr)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	// Write your code here
	}
}


Another method:
import java.util.Arrays;
public class Solution {

	
	public static void answer(String s1,String s2,String s3)
	{	int count[] = new int[26];
		for(int i=0;i<s1.length();i++){
			count[s1.charAt(i) - 'A']++;
		}
		for(int i=0;i<s2.length();i++){
			count[s2.charAt(i) - 'A']++;
		}
		for(int i=0;i<s3.length();i++){
			count[s3.charAt(i) - 'A']--;
		}
		for(int i=0;i<count.length;i++){
			if(count[i] != 0){
				System.out.println("NO");
				return;
			} 
		}
		System.out.println("YES");
		

		// Write your code here
	}
	

	
}
