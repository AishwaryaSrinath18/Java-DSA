//Given an array odd numbers should come left side and even number should come right side. (Do inplace shifting meaning use the same input array dont create any new array for storing the output)
//        Input: [1,2,3,4,5,6]
//        Output: [1,3,5,2,4,6]

import java.util.Scanner;
class Pointers{
    public void separateOddEven(int[] a){
        int left=0,right=a.length-1; // left and right pointers
        while(left<right){
            if (a[left] % 2 != 0 && a[right] % 2 != 0) left++;
            else if (a[left] % 2 != 0 && a[right] % 2 == 0) {
                left++;
                right--;
            } else if (a[left] % 2 == 0 && a[right] % 2 != 0) {
                int temp=a[right];
                a[right]=a[left];
                a[left]=temp;
                left++;
                right--;
            } else {
                if (left - right == 1) {
                    left++;
                    right--;
                }
                else right--;
            }
        }
    }
}

public class Separation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Array elements:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        Pointers p=new Pointers();
        p.separateOddEven(array);
        System.out.println("After separation:");
        for(int i=0;i<size;i++){
            System.out.print(array[i] + " ");
        }

    }
}
