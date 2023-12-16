public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int i=0,j=0,max=0;
        long sum=a[0];
        int n=a.length;
        while(j<n){
            while(sum>k&&i<=j){
                sum-=a[i];
                i++;
            }
            if(sum==k){
                max=Math.max(max,j-i+1);
            }
            j++;
            if(j<n){
                sum+=a[j];
            }
        }
        return max;
    }
}