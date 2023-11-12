/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
//Using binary search method

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long low=1;
        long high=n;
        long mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(guess((int)mid)==0) return (int)mid;
            else if(guess((int)mid)==1) low=mid+1;
            else high=mid-1;
        } 
        return -1;
    }
}
