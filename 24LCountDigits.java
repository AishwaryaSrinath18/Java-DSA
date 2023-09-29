class Solution {
    public int countDigits(int num) {
        int a=num;
        int count=0;
        while(num>0){
            int temp=num%10;
            if(a%temp==0) count++;
            num=num/10;
        }
        return count;
    }
}
