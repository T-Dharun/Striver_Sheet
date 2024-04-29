class Solution {
    int totalDays(int a[],int m){
        int sum=0,day=1;
        for(int i:a){
            if(sum+i>m){
                sum=i;
                day++;
            }
            else sum+=i;
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int m=Integer.MIN_VALUE;
        for(int i:weights){
            max+=i;
            m=Math.max(m,i);
        }
        int ans=0;
        System.out.println(totalDays(weights,3));
        int left=m,right=max;
        while(left<=right){
            int mid=(left+right)/2;
            int val=totalDays(weights,mid);
            if(val<=days) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}