class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int m=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            if(arr[i]<pivot){
                nums[m]=arr[i];
                m++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==pivot){
                nums[m]=arr[i];
                m++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>pivot){
                nums[m]=arr[i];
                m++;
            }
        }
        return nums;
    }
}
