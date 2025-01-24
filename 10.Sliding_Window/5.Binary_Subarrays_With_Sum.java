class Solution {
    public int minimumSum(int arr[],int goal){
        if(goal<0) return 0;
        int n=arr.length;
        int l=0,r=0,sum=0,cnt=0;
        while(r<n){
            sum+=arr[r];
            while(sum>goal){
                sum-=arr[l];
                l++;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return minimumSum(nums,goal)-minimumSum(nums,goal-1);
    }
}
