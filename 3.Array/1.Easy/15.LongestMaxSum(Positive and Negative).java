import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		int sum=0;
		HashMap<Integer,Integer> hash=new HashMap<>();
		int max=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
			sum+=nums[i];
			if(sum==k){
				max=Math.max(max,i+1);
			}
			int rem=sum-k;
			if(hash.containsKey(rem)){
				int len=i-hash.get(rem);
				max=Math.max(max,len);
			}
			if(!hash.containsKey(sum)){
				hash.put(sum,i);
			}
		}
		return max;
	}
}