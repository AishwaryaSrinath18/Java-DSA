import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
		ArrayList<Pair<Integer, Integer>>  result = new ArrayList<Pair<Integer, Integer>>() ;
		Collections.sort(arr);
		int start = 0;
		int end = arr.size()-1;
		while(start<end){
			if(arr.get(start)+arr.get(end) == target){
				Pair<Integer, Integer> sum = new Pair<>(arr.get(start), arr.get(end));
				result.add(sum);
				start++;
				end--;
			}
			else if(arr.get(start)+arr.get(end) > target) end--;
			else start++;
		}
		if(result.size() == 0){
			Pair<Integer, Integer> sum = new Pair<>(-1, -1);
			result.add(sum);
		}
		return result;
	}
}
