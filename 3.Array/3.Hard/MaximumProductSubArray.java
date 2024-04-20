class Solution {
    public int maxProduct(int[] nums) {
        int prev=1,suf=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prev==0) prev=1;
            if(suf==0) suf=1;
            prev*=nums[i];
            suf*=nums[n-i-1];
            max=Math.max(max,Math.max(prev,suf));
        }
        return max;
    }
}