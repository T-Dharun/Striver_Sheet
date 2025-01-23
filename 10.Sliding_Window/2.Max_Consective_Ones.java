class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int l=0,r=0,zero=0;
        while(r<n){
            if(nums[r]==0) zero++;
            if(zero<=k) max=Math.max(max,r-l+1);
            else{
                if(nums[l]==0) zero--;
                l++;
            }
            r++;
        }
        return max;
    }
}
