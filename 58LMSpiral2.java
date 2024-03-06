// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        while (left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                matrix[top][i] = value++;
            } top++;
            if(left > right || top > bottom) break;

            for(int i=top; i<=bottom; i++){
                matrix[i][right] = value++;
            } right--;
            if(left > right || top > bottom) break;

            for(int i=right; i>=left; i--){
                matrix[bottom][i] = value++;
            }bottom--;
            if(left > right || top > bottom) break;

            for(int i=bottom; i>=top; i--){
                matrix[i][left] = value++;
            } left++;
            if(left > right || top > bottom) break;
        }
        return matrix;
    }
}
