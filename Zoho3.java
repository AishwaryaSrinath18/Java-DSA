/*
 Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true)
 then make all the cells of ith row and jth column as 1
 */


import java.util.Scanner;

public class BooleanMatrix3 {
    // More Time Complexity
    public static void changeMatrix(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 1){
                    int rowIndex = i;
                    for(int column=0;column<array[0].length;column++){
                        if(array[rowIndex][column] != 1) array[rowIndex][column] = -1;
                        // -1 because the other 1 in the respective row or column cna be found
                    }
                    int columnIndex = j;
                    for(int row=0;row<array.length;row++){
                        if(array[row][columnIndex] != 1) array[row][columnIndex] = -1;
                    }
                }
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == -1) array[i][j] = 1;
                // after checking full matrix, making all -1 to 1
            }
        }
    }
    // Less Time Complexity but have m+n extra space
    public static void changeMatrix2(int[][] array){
        int[] row = new int[array.length]; // Extra array to maintain the ith and jth index
        int[] column = new int[array[0].length];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 1){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(row[i] == 1){
                    for(int col=0;col<array[0].length;col++){
                        array[i][col] = 1;
                    }
                }
                if(column[j] == 1){
                    for(int r=0;r<array.length;r++){
                        array[r][j] = 1;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size m:");
        int m = sc.nextInt();
        System.out.println("Array Size n:");
        int n = sc.nextInt();
        System.out.println("Array Elements:");
        int[][] array = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j] = sc.nextInt();
            }
        }
        changeMatrix2(array);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}

