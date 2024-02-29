/*Given an array of integers, compute the maximum value for each integer in the index,
by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)
•	Input:
•	5
•	120 24 71 10 59
•	Output:
•	3 8 8 1 45
*/
package ZohoQuestions;

import java.util.Arrays;

public class Zoho17 {
    public static void main(String[] args) {
        int[] array = new int[]{120, 24, 71, 10, 59};
        for(int i=0; i< array.length; i++){
            array[i] = maximumValue(array[i]);
        }
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    private static int maximumValue(int i) {
        int sum =0;
        int product = 1;
        while(i>0){
            int temp = i%10;
            sum += temp;
            product *= temp;
            i = i/10;
        }
        if(sum > product) return sum;
        else return product;
    }
}
