class Solution {
    public void merge(int nums[],int l,int mid,int r){
      int i=l,j=mid+1;
      int temp[]=new int[r-l+1];
      int k=0;
      while(i<=mid && j<=r){
        if(nums[i]>nums[j]){
          temp[k]=nums[j];
          j++;
        }
        else{
          temp[k]=nums[i];
          i++;
        }
        k++;
      }
      while(i<=mid){
        temp[k]=nums[i];
        k++;
        i++;
      }
      while(j<=r){
        temp[k]=nums[j];
        k++;j++;
      }
      k=0;
      for(;l<=r;l++){
        nums[l]=temp[k];
        k++;
      }
    }
    public int calc(int nums[],int l,int mid,int r){
      int cnt=0;
      int j=mid+1;
      for(int i=l;i<=mid;i++){
        while(j<=r && nums[i]>2*(long)(nums[j])) j++;
        cnt+=(j-mid-1);
      }
      return cnt;
    }
    public int mergeSort(int nums[],int i,int n){
      if(i>=n) return 0;
      int mid=(i+n)/2;
      int l=mergeSort(nums,i,mid);
      int r=mergeSort(nums,mid+1,n);
      int cnt=calc(nums,i,mid,n);
      merge(nums,i,mid,n);
      return l+r+cnt;
    }
    public int reversePairs(int[] nums) {
      return mergeSort(nums,0,nums.length-1);
    }
}
