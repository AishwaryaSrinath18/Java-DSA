package ZohoQuestions;
/*TWISTED PRIME NUMBER
A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number.
Input : 97
Output : Twisted Prime Number
Explanation: 97 is a prime number and its reverse 79 is also a prime number.
*/
public class Zoho43 {
    public static void main(String[] args) {
        int n = 23;
        int copy = n;
        int rev = 0;
        while(n>0) {
            int temp = n % 10;
            rev = rev* 10 + temp;
            n = n / 10;

        }
        if(isPrime(copy) && isPrime(rev)) System.out.println( copy +" is twisted prime");
        else System.out.println(copy +" is not twisted prime");
    }
    private static boolean isPrime(int n){
        int count = 0 ;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0) count++; // checking till half of the number
        }
        count++; // increasing one since the number itself a factor
        if(count == 2) return true; // checking whether it is prime by the count of factors
        return false;
    }
}
