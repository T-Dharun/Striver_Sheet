class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(i,max);
        }
        int i=0;
        int ans=0;
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int val=arr[mid]-(mid+1);
            if(val<k) left=mid+1;
            else right=mid-1;
        }
        return left+k;
    }
}