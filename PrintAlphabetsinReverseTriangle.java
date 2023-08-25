class Solution {

    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=65;j<65+n-i;j++){
                System.out.print((char)j);
            }
        System.out.println();    
        }
    }
}
