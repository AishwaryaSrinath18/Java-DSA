package ZohoQuestions;/*Equilibrium index of an array is an index such that the
sum of elements at lower indexes is equal to the sum of elements at higher indexes.
For example, in an array A:
Example : Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1
*/

import java.util.Scanner;

public class Equilibrium3 {
    // This method is 2times traversal but with less space complexity
    public static int equili(int[] array){
        int sum = 0; // total sum of the array acts as a right sum
        int leftSum = 0; // to calculate the left sum
        for(int i=0; i<array.length;i++) sum += array[i];
        for(int j=0; j<array.length;j++){
            sum -= array[j];
            // subtracting the value from the sum to check
            // whether it is the equilibrium index
            // now this sum acts as a right sum
            if(sum == leftSum) return j;
            leftSum += array[j];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size:");
        int size = sc.nextInt();
        System.out.println("Array Elements:");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int index = equili(array);
        System.out.println("Equilibrium Index is: "+index);
    }
}
