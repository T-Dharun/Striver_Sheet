class Solution {
    int fin=Integer.MAX_VALUE;
    public boolean solve(int nums[],int mid,int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
                i++;
            }
        }
        return (count>=k);
    }
    public int minCapability(int[] nums, int k) {
        int left=Integer.MAX_VALUE,right=0;
        for(int i:nums){
            left=Math.min(i,left);
            right=Math.max(i,right);
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(solve(nums,mid,k)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}
