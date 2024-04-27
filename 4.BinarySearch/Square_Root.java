import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		long left=0,right=N;
		long m=0;
		while(left<=right){
			long mid=(left+right)/2;
			long ans=mid*mid;
			if(ans==N) return (int)mid;
			else if(ans<N){
				m=mid;
				left=mid+1;
			}
			else right=mid-1;
		}
		return (int) right;
	}
}
