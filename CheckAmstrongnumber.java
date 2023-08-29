import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		double dup=n;
	    double temp=0;
	    double ans=0;
		double count=0;
		for(double a=1;a<=n;a++){
			if(n>Math.pow(10,a) && n<Math.pow(10,a+1))
			count=a+1;
		}
	    while(n>0){
			temp=n%10;
		    ans = Math.pow(temp,count)+ans;
			n=n/10;
		}
		if(dup==ans){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
