class Solution {
    void reverse(int nums[],int i,int j){
        if(i>=j) return;
        else{
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            reverse(nums,++i,--j);
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int pivot;
        if(k<=n) pivot=n-k;
        else pivot=n-(k%n);
        reverse(nums,0,pivot-1);
        reverse(nums,pivot,n-1);
        reverse(nums,0,n-1);
    }
}