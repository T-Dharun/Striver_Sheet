class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        int n=nums.length;
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int left=1,right=nums.length-2;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid+1]!=nums[mid]&& nums[mid-1]!=nums[mid]){
                return nums[mid];
            }
            if((mid%2==1&&nums[mid]==nums[mid-1])||(mid%2==0 && nums[mid]==nums[mid+1]))
                left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}