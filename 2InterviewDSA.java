// Minimum and Maximum of an array
// TC=O(log n)
import java.util.Scanner;

public class MinAndMax {
    public static void main(String args[]){
        int size =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Size: ");
        size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Array Elements");
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        int min=array[0];
        int max=array[0];
        for(int i=0;i<size/2;i++){
            if(max<array[i]) max=array[i];
            if(max<array[array.length-1-i]) max=array[array.length-1-i];
            if(min>array[i]) min=array[i];
            if(min>array[array.length-1-i]) min=array[array.length-1-i];
        }
        System.out.println("Minimum is "+min+" and Maximum is "+max);
    }
}
