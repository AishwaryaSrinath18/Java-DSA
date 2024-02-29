package ZohoQuestions;
/*-1 represents ocean and 1 represents land find the number of islands in the given matrix.
Input:   n*n matrix
       1 -1 -1  1
      -1  1 -1  1
      -1 -1  1 -1
      -1 -1 -1  1
Output: 2 (two islands that I have
bold in matrix at 1, 1 and 2, 2)
*/
public class Zoho18 {
    public static void main(String[] args) {
        int[][] map = new int[][]{{1, -1, -1, 1}, {-1, 1, -1, 1}, {-1, -1, 1, -1}, {-1, -1, -1, 1}};
        int numberOfIslands = countIsland(map);
        System.out.println("Islands = "+ numberOfIslands);
    }

    private static int countIsland(int[][] map) {
        int islands = 0;
        for(int i=1; i<map.length-1; i++){
            for(int j=0; j<map[0].length-1; j++){
                if(map[i][j] == 1){
                    if(map[i][j-1] == -1 && map[i][j+1] == -1 && map[i-1][j] == -1 && map[i+1][j] == -1) islands++;
                    // Checking whether it is covered with ocean on all sides
                }
            }
        }
        return islands;
    }
}
