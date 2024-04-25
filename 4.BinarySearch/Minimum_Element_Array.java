class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        int ans=nums[nums.length/2];
        while(left<=right){
            int mid=(left+right)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[left]<=nums[mid]){
                ans=Math.min(ans,nums[left]);
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}