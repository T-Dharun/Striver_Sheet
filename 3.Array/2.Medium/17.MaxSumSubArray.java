import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long max=0,sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			if(sum<0) sum=0;
			if(sum>max) max=sum;
		}
		return max;
	}

}
