// The game can be explained as in array of elements checking the first element and second finding the 
// greatest, gretaest is the winner ,counting the times of greatest 
// checking the number which is k times greater and returning the winner

class Solution {
    public int getWinner(int[] arr, int k) {
        int count=0;
        if(k==1) return Math.max(arr[0],arr[1]);
        if(k>=arr.length) return Arrays.stream(arr).max().getAsInt();
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp>arr[i]){
                count++;
            }
            else{
                count=1;
                temp=arr[i];
            }
            if(count==k) return temp;
        }
        return temp;
    }
}
