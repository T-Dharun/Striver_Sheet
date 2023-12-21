class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,n=nums.length;
        int j=0;
        while(i<n){
            if(nums[i]!=0){
                nums[j]=nums[i];
                if(i!=j)
                nums[i]=0;
                j++;
            }
            i++;
        }
    }
}