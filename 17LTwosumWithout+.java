// a and b have two possiblities positive and negative 
// gives 4 possible combinations

class Solution {
    public int getSum(int a, int b) {
        int count=a;
        for(int i=1;i<=Math.abs(b);i++){
        if(a>=0 && b>=0){
            count++;
        }
        else if(a<0 && b>=0){
            count++;
        }
        else{
            count--;
        }
      }
        return count;
    }
}
