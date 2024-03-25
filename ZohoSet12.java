package ZohoQuestions;
/*Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
1. 5 if a perfect square  2. 4 if multiple of 4 and divisible by 6 3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order.
Time Complexity : O(n2)
*/
public class Zohoset1ii {
    public static void main(String[] args) {
        int[] array = new int[]{10,36,89};
        sortWeight(array);
    }
    private static void sortWeight(int[] array) {
        int[][] updatedArray = calculateWeight(array);
        for(int i=0; i<updatedArray.length; i++){
            int minIndex = i;
            for(int j=i+1; j< updatedArray.length; j++){
                if (updatedArray[i][1] > updatedArray[j][1]) { // comparing only the second column that is the weight
                    minIndex = j;
                    int tempValue = updatedArray[i][0]; // swapping the respective weights and value
                    int tempWeight = updatedArray[i][1];
                    updatedArray[i][0] = updatedArray[minIndex][0]; 
                    updatedArray[i][1] = updatedArray[minIndex][1];
                    updatedArray[minIndex][0] = tempValue;
                    updatedArray[minIndex][1] = tempWeight;
                }
            }
        }
        for(int i=0; i<updatedArray.length; i++){
            for(int j=0; j<updatedArray[0].length; j++){
                System.out.print(updatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[][] calculateWeight(int[] array) {
        int[][] weightArray = new int[array.length][2]; // to store weight of the respective number
        for(int i=0; i<array.length; i++){
            int weight = 0;
            if(isPerfectSquare(array[i])) weight += 5;
            if(array[i]%4 == 0 && array[i]%6 ==0) weight += 4;
            if(array[i]%2 == 0) weight += 3;
            weightArray[i][0] = array[i]; // first column given number
            weightArray[i][1] = weight; // second column respective weights of the given number
        }
        return weightArray;
    }
    private static boolean isPerfectSquare(int n) {
        if(n == 1) return true;
        for(int i=2; i<=n/2; i++){
            if(i*i == n) return true;
        }
        return false;
    }
}
