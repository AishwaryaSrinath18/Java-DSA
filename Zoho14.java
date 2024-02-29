package ZohoQuestions;
/*Sample Input – Alternate Sorting
Input: {1, 2, 3, 4, 5, 6, 7}
output: {7, 1, 6, 2, 5, 3, 4}
*/
public class Zoho14 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        alternateSorting(array);
    }
    private static void alternateSorting(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left<right){
            System.out.print(array[right]);
            System.out.print(array[left]);
            left++;
            right--;
        }
        if(array.length%2 != 0) System.out.print(array[(array.length/2)]);
    }
}
