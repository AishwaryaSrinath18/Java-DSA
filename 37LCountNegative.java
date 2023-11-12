class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=0;
        int column=0;
        while(row<grid.length){
            while(column<grid[row].length){
                if(grid[row][column]<0) count++;
                column++;
            }
            row++;
            column=0;
        }
        return count;
    }
}
