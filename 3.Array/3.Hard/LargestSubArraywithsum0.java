import java.util.*;
public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int n=arr.length;
        int max=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max=Math.max(max,i)+1;
            }
            if(hash.containsKey(sum)){
                int j=hash.get(sum);
                max=Math.max(max,i-j);
            }
            else
                hash.put(sum,i);
        }
        return max;
    }
}