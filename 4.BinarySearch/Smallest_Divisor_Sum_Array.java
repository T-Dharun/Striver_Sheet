class Solution {
    int findSum(int a[],int d){
        int sum=0;
        for(int i:a){
            sum+=Math.ceil((double)i/(double)d);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int left=1,right=max;
        while(left<=right){
            int mid=(left+right)/2;
            int val=findSum(nums,mid);
            if(val<=threshold) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}