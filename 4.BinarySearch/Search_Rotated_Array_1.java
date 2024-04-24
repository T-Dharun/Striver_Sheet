class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target&&nums[mid]>=target){
                    right=mid-1;
                }
                else left=mid+1;
            }
            else{
                if(nums[mid]<=target&&nums[right]>=target) left=mid+1;
                else right=mid-1;
            }
        }
        return ans;
    }
}