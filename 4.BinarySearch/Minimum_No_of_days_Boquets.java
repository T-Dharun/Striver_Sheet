class Solution {
    
    boolean calc(int []a,int m,int k,int val){
        int cnt=0,sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=val) cnt++;
            else{
                sum+=(cnt/k);
                cnt=0;
            }
        }
        sum+=(cnt/k);
        if(sum>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=bloomDay.length;
        long v=(long)m*k;
        if(n<v) return -1;
        for(int i:bloomDay){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        int left=min,right=max;
        while(left<=right){
            int mid=(left+right)/2;
            boolean val=calc(bloomDay,m,k,mid);
            if(val){
                right=mid-1;
            }
            else left=mid+1;
        }
        return left;
    }
}