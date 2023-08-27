public class Solution {
	
	public static int gcd(int a,int b){
		int ans=1;
		int n=0;
		if(a>b){
			n=b;
		}
		else n=a;
		for(int i=1;i<=n;i++){
			if(a%i==0 && b%i==0){
                ans=i;
			}
		}
		return ans;
	}		
}
