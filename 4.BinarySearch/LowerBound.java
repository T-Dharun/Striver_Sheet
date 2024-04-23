public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        
        int left=0;
        int right=n-1;
        int ans=n;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=x){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}