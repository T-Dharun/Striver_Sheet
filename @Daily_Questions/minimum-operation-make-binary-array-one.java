class Solution {
    public void toggle(int[] nums,int left,int right){
        for(;left<=right;left++){
            nums[left]=nums[left]==1?0:1;
        }
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int left=0,right=2;
        int ans=0;
        while(right<n){
            
            if(nums[left]==0){
                toggle(nums,left,right);
                ans++;
            }

            while(left<n && (nums[left]==1) && left<=right){
                left++;
            }
            right=left+2;
        }
        for(int i:nums){
            if(i!=1) return -1;
        }
        return ans;
    }
}
