import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int count =1;
		for(int i=1;i<n;i++){
			int a=arr.get(i);
			int b=arr.get(i-1);
			if(a!=b) count++;
		}
		return count;
	}
}