class Solution {
    public int reverse(int x) {
        boolean flag=false;
        int temp=0;
        long rev=0;
        if(x<0){
            x=x*(-1);
            flag=true;
        }
        while(x>0){
            temp=x%10;
            rev=rev*10+temp;
            x=x/10;
        }
        if(flag==true){
            rev=rev*(-1);
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            rev=0;
        }
        return (int)rev;
    }
}
