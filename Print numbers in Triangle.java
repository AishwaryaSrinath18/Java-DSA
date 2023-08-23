class Solution {

    void printTriangle(int n) {
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(a+" ");
                a=a+1;
            }
             System.out.println();
        }
    }
}
