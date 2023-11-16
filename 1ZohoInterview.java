/*Given nested array or list S, write a program to combine the arrays as shown
* S=[[1,0,3],[2,0,4],[3,0,5],[4,0,6]]
* Output [1,2,6,8,5,6]
* Explanation:
* 1 0 3
*   2 0 4
*     3 0 5
*       4 0 6
* ------------
* 1 2 6 8 5 6 
* Here the logic is index of new array equals to the sum of i and j in 2D array
* For example: newArray[2]=array[0][2]+array[2][0]+array[1][1]
*/

import java.util.Scanner;

class Solution{
    public int[] combine(int m,int n,int array[][]){
        int[] ansArray=new int[m+n-1]; // Answer Array and the length will be sum of the 2D size and minus 1
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ansArray[i+j]+=array[i][j]; // The logic works like the array is added in the crosses
            }
        }
        return ansArray;
    }
}

public class CombineArray {
    public static void main(String args[]){
        System.out.println("Size of the Array m and n:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] array=new int[m][n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                array[i][j] = sc.nextInt(); // to get the 2D array elements
            }
        }
        System.out.println("Array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                System.out.print(array[i][j]+" "); // print 2D array elements
            }
            System.out.println();
        }
        Solution s=new Solution();
        int[] combinedArray;
        combinedArray=s.combine(m,n,array);
        System.out.println("Combined Array:");
        for(int x:combinedArray){
            System.out.print(x+" "); //Combined array elements
        }
    }
}
