class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int right,left,ans;
        long sum=0;
        right=left=0;
        ans=0;
        while(right<nums.length){
            sum+=nums[right];
            while((right-left+1)*(long)nums[right]-sum>k){
                sum-=nums[left];
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}