class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=nums[i]*sum;
            //sum+=nums[i]*nums[i]*sum;
            sum+=nums[i];
         max=Math.max(max,sum);   
        }
        return max;
    }
}