class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1;
        if(n==1) return ;
        int i=0;
        while(i<=right){
            if(nums[i]==0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
                i++;
            }
            else if(nums[i]==1){
                //left++;
                i++;
            }
            //if(nums[i]==2){
            else{
                int temp=nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
              //  i++;
             right--;
            }
        }
    }
}