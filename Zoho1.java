/*Given an array of integers, replace every element with
the next greatest element (greatest element on the balance right side) in the array.
Since there is no element next to the last element, replace it with -1.
For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}. */

import java.util.Scanner;

public class GreatestRight1 {
      // Time Complexity: O(n)
      public static void greatest(int[] array){
          int max = array[array.length-1];
          array[array.length-1] = -1;
          for(int i=array.length-2; i>=0; i--){
              int temp = array[i]; //Storing the current element
              array[i] = max;
              if(max < temp) max = temp; //Comparing current element with the max
          }
      }

//    Time Complexity: O(n^2)      
//    public static void greatest(int[] array){
//        for(int i=0;i<array.length-1;i++){
//            int max = array[i+1];
//            for(int j=i+1;j<array.length;j++){
//                if(array[j] >= max) max = array[j];
//            }
//            array[i] = max;
//        }
//        array[array.length-1] = -1;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size:");
        int size = sc.nextInt();
        System.out.println("Array Elements:");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        greatest(array);
        for(int i=0;i<size;i++){
            System.out.print(array[i] + " ");
        }
    }
}
