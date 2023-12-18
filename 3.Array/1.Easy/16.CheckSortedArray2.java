class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int i=1,j=0;
        int temp=-1;
        while(i<n){
            if(nums[i-1]>nums[i]){
                while(i<n-1){
                    if(nums[i]<=nums[i+1]){
                        //temp=nums[i+1];
                    }
                    else return false;
                    //temp=nums[i+1];
                    i++;
                }
                temp=nums[i];
                if(temp>min) return false;
            }
            i++;
        }
        return true;
    }
}