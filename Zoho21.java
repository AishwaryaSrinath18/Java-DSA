package ZohoQuestions;
/*Given N. print the following snake pattern (say N = 4). condition:
must not use arrays ( 1D array  or 2D array like Matrix ).
1   2   3   4
8   7   6    5
9   10  11   12
16  15  14  13
*/
public class Zoho21 {
    public static void main(String[] args) {
        printSanke(6);
    }

    private static void printSanke(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j< n; j++){
                if(i %2 == 0) System.out.print(((n*i)+(j+1)) + " ");
                else System.out.print(((n*i)+(n-j)) + " ");
            }
            System.out.println();
        }
    }
}
