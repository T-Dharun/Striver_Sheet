class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1 || nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int left=1,right=n-2;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid]>nums[mid-1]) left=mid+1;
            else if(nums[mid]>nums[mid+1]) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}