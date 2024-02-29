package ZohoQuestions;
/*Assume there exists infinite grid, you’re given initial position x, y. Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.
Input:  4 5 //initial position x, y    9 //number of movements    U L R R D D U L R // movements
Output: 5 5
*/
public class Zoho16 {
    public static void main(String[] args) {
        changePosition("ULRRDDULR",4, 5);
    }
    public static void changePosition(String moves, int x, int y){
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U') y++;
            else if(moves.charAt(i) == 'D') y--;
            else if(moves.charAt(i) == 'R') x++;
            else if(moves.charAt(i) == 'L') x--;
        }
        System.out.println("X position "+ x + " Y position " + y);
    }
}
