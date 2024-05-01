class Solution {
    int split(int a[],int ans){
        int split=1,load=0;

        for(int i=0;i<a.length;i++){
            if(a[i]+load<=ans){
                load+=a[i];
            }
            else{
                load=a[i];
                split++;
            }
        }
        return split;
    }
    public int splitArray(int[] nums, int k) {
        int left=Integer.MIN_VALUE,right=0;
        for(int i:nums){
            left=Math.max(left,i);
            right+=i;
        }
        while(left<=right){
            int mid=(left+right)/2;
            int val=split(nums,mid);
            if(val<=k) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}