class Solution {
    int binary(int left,int right,int target,int []nums){
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target){
            return binary(left,mid-1,target,nums);
        }
        return binary(mid+1,right,target,nums);
    }
    public int search(int[] nums, int target) {
        return binary(0,nums.length-1,target,nums);
    }
}