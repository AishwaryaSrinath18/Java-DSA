
class Solution {

    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=65;j<=65+i;j++){
                System.out.print((char)(i+65));
            }
        System.out.println();    
        }
    }
}
