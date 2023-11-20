// Snake matrix : Inverted S
// Space Complexity : O(1)
import java.util.Scanner;

class Evolve{
    public void reverseRow(int arr[][], int row){
        for(int i=0;i<arr[0].length/2;i++){
            int temp=arr[row][arr[0].length-i-1];
            arr[row][arr[0].length-i-1]=arr[row][i];
            arr[row][i]=temp;
        }
    }
}


public class Snake {
    public static void main(String args[]){
        int m=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length: ");
        System.out.print("m: ");
        m=sc.nextInt();
        System.out.print("n: ");
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        Evolve ev=new Evolve();
        for(int i=0;i<m;i++){
            if(i%2!=0) ev.reverseRow(arr,i);
        }
        System.out.println("Snake Matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
