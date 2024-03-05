package ZohoQuestions;
/*Given N. print the Latin Matrix (say N = 3).
condition:  must not use strings(aka character literals),
arrays (both 1D and 2D), inbuilt functions(like rotate).
A   B   C
B   C   A
C   A   B
*/
public class Zoho22 {
    public static void main(String[] args) {
        printLatinSquare(4);
    }
    private static void printLatinSquare(int n) {
        int k = n+1; // to control rotation point
        // for the first time it will be n+1 since no rotation required
        for(int i=0; i<n; i++){
            int temp = k;
            while(temp <= n){
                System.out.print((char)('A'+ temp - 1)+ " ");
                // for printing the first part of rotation
                temp++;
                // rotating part will be increasing order
            }
            for(int j=1; j<k; j++){
                System.out.print((char)('A'+ j - 1) + " ");
                // printing the other part of the matrix
            }
            k--;
            System.out.println(

            );
        }
    }
}
