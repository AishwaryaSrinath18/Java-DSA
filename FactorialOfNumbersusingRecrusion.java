import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
       List<Long> list=new ArrayList<>();   
       long res=1;
       long count=1;
       while(res<=n/count){
           res=res*count;
           count++;
           list.add(res);
       }
       return list;
       
    }
}
