package ZohoQuestions;
/*Matrix Diagonal sum
Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
I/P: 3 3
1 2 3
4 5 6
7 8 9 O/P: 38 */
public class Zoho34 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int answer = diagonalSum(matrix);
        System.out.println("Sum: "+ answer);
    }
    private static int diagonalSum(int[][] matrix) {
        int leftTriangle = 0;
        int rightTriangle = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i+j < matrix.length) leftTriangle += matrix[i][j];
                if(i+j+1 >= matrix.length ) rightTriangle += matrix[i][j];
                System.out.println(leftTriangle + " " +rightTriangle);
            }
        }
        if(leftTriangle > rightTriangle) return leftTriangle;
        else return rightTriangle;
    }
}
