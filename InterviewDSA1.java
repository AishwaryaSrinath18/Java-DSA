class Solution2 {
    public void reverse(int[] num){
        for(int k=0;k<num.length/2;k++){   // runs till half of the size
            int temp=num[num.length-1-k];
            num[num.length-1-k]=num[k];
            num[k]=temp;
        }
    }
}

public class Reverse {
    public static void main(String args[]){
        int[] arr=new int[]{1,2,0,4,5,6}; //Even number of terms
        int[] arr2=new int[]{1,2,0,4,5}; //Odd number of terms
        Solution2 s=new Solution2();
        s.reverse(arr);
        s.reverse(arr2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
// Space Complexity: O(1)
// Time complexity: O(log n)
// For example: if we have six elements, 1st and 6th will be interchanged like wise
// 2nd and 5th , 3rd and 4th will be interchanged
// For odd terms centre term will remain unchanged
