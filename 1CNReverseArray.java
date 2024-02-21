import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {   // Write your code here.
        int length = arr.size() - 1;
        for(int i=m+1;i<arr.size() && length>i;i++){
            int temp = arr.get(length);
            arr.set(length, arr.get(i));
            arr.set(i, temp);
            length--;
        }
    }
}
