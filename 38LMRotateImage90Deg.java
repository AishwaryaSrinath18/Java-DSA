//As rotating the image the terms interchange like
// LeftTop -> RightTop
// RightTop -> RightBottom
// RightBottom -> LeftBottom
// LeftBottom -> LeftTop
// this is happened recursively for all the terms respectively

class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<(n+1)/2;i++){
            for(int j=0;j<n/2;j++){
                //temp=LB
                int temp= matrix[n-1-j][i];
                //LB=RB
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                //RB=RT
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                //RT=LT
                matrix[j][n-1-i]=matrix[i][j];
                //LT=temp
                matrix[i][j]=temp;
            }
        }
    }
}
