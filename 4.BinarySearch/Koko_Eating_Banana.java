class Solution {
    int calc(int arr[],int m){
        int sum=0;
        for(int i:arr){
            sum+=Math.ceil((double)i/(double)m);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=Integer.MIN_VALUE;
        for(int i:piles) n=Math.max(i,n);
        int left=1,right=n;
        while(left<=right){
            int mid=(left+right)/2;
            int num=calc(piles,mid);
            if(num<=h) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}